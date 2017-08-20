package semantic;

import org.antlr.v4.runtime.Token;
import semantic.gen.QB64v3Parser;

import java.util.*;

/**
 * Created by milderhc on 6/04/17.
 */
public class QBProgram {
    private Map<String, Sub> subs;
    private Map<String, Function> functions;

    private Map<String, Variable> sharedMemory;
    private Stack<Map<String, Variable>> dynamicMemory, staticMemory;
    private Stack<List<String>> dynamicIds, staticIds;
    private Stack<TreeSet<String>> ignoredShared;

    public SemanticErrorHandler errorHandler;
    private QBVisitor visitor;

    public QBProgram (QBVisitor visitor) {
        this.visitor = visitor;

        subs = new TreeMap<>();
        functions = new TreeMap<>();
        dynamicMemory = new Stack<>();
        staticMemory = new Stack<>();
        sharedMemory = new TreeMap<>();
        dynamicIds = new Stack<>();
        staticIds = new Stack<>();
        ignoredShared = new Stack<>();

        errorHandler = new SemanticErrorHandler();
        createNewScope();
    }

    public void createNewScope () {
        dynamicMemory.push(new TreeMap<>());
        staticMemory.push(new TreeMap<>());
        ignoredShared.push(new TreeSet<>());
        addTemporalScope();
    }

    public void deleteScope () {
        dynamicIds.pop();
        staticIds.pop();
        dynamicMemory.pop();
        staticMemory.pop();
        ignoredShared.pop();
    }

    public void addTemporalScope () {
        dynamicIds.push(new LinkedList<>());
        staticIds.push(new LinkedList<>());
    }

    public void deleteTemporalScope () {
        for (String s : dynamicIds.peek())
            dynamicMemory.peek().remove(s);
        for (String s : staticIds.peek())
            staticMemory.peek().remove(s);
        dynamicIds.pop();
        staticIds.pop();
    }

    public void createDynamicVariable(Variable v) {
        dynamicIds.peek().add(v.getName());
        dynamicMemory.peek().put(v.getName(), v);
    }

    public void createStaticVariable(Variable v) {
        if (v.isShared())
            sharedMemory.put(v.getName(), v);
        staticIds.peek().add(v.getName());
        staticMemory.peek().put(v.getName(), v);
        v.addSuffix();
        createDynamicVariable(v);
    }

    public void addFunction (String name, Function f) {
        functions.put(name, f);
    }

    public void addSub (String name, Sub sub) {
        subs.put(name, sub);
    }

    public ArrayQB createArray (String arrayName, Value.Type type, List<Variable> pos, boolean shared, Token token) {
        List<Integer> dimensions = new LinkedList<>();
        pos.forEach(p -> dimensions.add(p.intValue()));
        switch (type) {
            case INTEGER:
                return new ArrayQB<Short>(arrayName, Value.Type.INTEGER, dimensions, shared);
            case LONG:
                return new ArrayQB<Integer>(arrayName, Value.Type.LONG, dimensions, shared);
            case SINGLE:
                return new ArrayQB<Float>(arrayName, Value.Type.SINGLE, dimensions, shared);
            case DOUBLE:
                return new ArrayQB<Double>(arrayName, Value.Type.DOUBLE, dimensions, shared);
            default:
                return new ArrayQB<String>(arrayName, Value.Type.STRING, dimensions, shared);
        }
    }

    public Variable createVariable (String name, Value.Type type, boolean shared) {
        switch (type) {
            case INTEGER:
                return new Variable<Short>(name, Variable.Type.INTEGER, false, shared);
            case LONG:
                return new Variable<Integer>(name, Variable.Type.LONG, false, shared);
            case SINGLE:
                return new Variable<Float>(name, Variable.Type.SINGLE, false, shared);
            case DOUBLE:
                return new Variable<Double>(name, Variable.Type.DOUBLE, false, shared);
            default:
                return new Variable<String>(name, Variable.Type.STRING, false, shared);
        }
    }

    public void createDimVariable (QB64v3Parser.DimIdContext ctx, Value.Type type, boolean shared) {
        String name = ctx.ID().getText().toLowerCase();
        Token token = ctx.getStart();

        if (functions.containsKey(name) || subs.containsKey(name))
            errorHandler.idAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

        String suffix = Variable.getSuffix(type);

        if (ctx.array() != null) {
            String arrayName = ArrayQB.getArrayId(name);
            if (staticMemory.peek().containsKey(arrayName))
                errorHandler.arrayAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

            if (dynamicMemory.peek().containsKey(arrayName + suffix))
                errorHandler.arrayAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

            createStaticVariable(createArray(arrayName, type, (List<Variable>) visitor.visit(ctx.array()), shared, token));
        } else {
            if (staticMemory.peek().containsKey(name))
                errorHandler.idAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

            if (dynamicMemory.peek().containsKey(name + suffix))
                errorHandler.idAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

            createStaticVariable(createVariable(name, type, shared));
        }
    }

    public void assign (Variable var, Variable val, Token token) {
        if (var.isConstType()) {
            errorHandler.constAssignmentError(token.getLine(), token.getCharPositionInLine(), var.getName());
        }

        if (var instanceof ArrayQB && !(val instanceof ArrayQB))
            errorHandler.incompatibleArrayError(token.getLine(), token.getCharPositionInLine(), val.getType());

        if (!(var instanceof ArrayQB) && val instanceof ArrayQB) {
            if (var.getType() == Value.Type.STRING)
                errorHandler.incompatibleSingleStringVariableError(token.getLine(), token.getCharPositionInLine());
            errorHandler.incompatibleSingleNumericVariableError(token.getLine(), token.getCharPositionInLine());
        }

        if (var instanceof ArrayQB) {
            if (var.getType() != val.getType()) {
                List<Value.Type> expected = new LinkedList<>();
                expected.add(var.getType());
                errorHandler.incompatibleTypesError(token.getLine(), token.getCharPositionInLine(), expected, val.getType());
            }

            ((ArrayQB) var).setDimensions(((ArrayQB) val).copyDimensions());
            ((ArrayQB) var).setValues(((ArrayQB) val).copyValues());
            return;
        }

        if (var.getType() != Value.Type.STRING &&
                val.getType() == Value.Type.STRING)
            errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());

        if (var.getType() == Value.Type.STRING &&
                val.getType() != Value.Type.STRING)
            errorHandler.incompatibleStringError(token.getLine(), token.getCharPositionInLine(), val.getType());

        var.setValue(Value.createValue(val.getValue(), var.getType()).getValue());
    }

    public void createConst (Variable var, Variable val, Token token) {
        assign(var, val, token);
        var.setConstType(true);
        createDynamicVariable(var);
    }

    public boolean containsFunction (String name) {
        return functions.containsKey(name);
    }

    public boolean containsSub (String name) {
        return subs.containsKey(name);
    }

    public boolean containsDynamicVariable (String name) {
        return dynamicMemory.peek().containsKey(name);
    }

    public boolean containsStaticVariable (String name) {
        if (!ignoredShared.peek().contains(name) && sharedMemory.containsKey(name))
            return true;
        return staticMemory.peek().containsKey(name);
    }

    public Variable getDynamicVariable (String name) {
        return dynamicMemory.peek().get(name);
    }

    public Variable getStaticVariable (String name) {
        if (!ignoredShared.peek().contains(name) && sharedMemory.containsKey(name))
            return sharedMemory.get(name);
        return staticMemory.peek().get(name);
    }

    public Variable callFunction (String name, List<Variable> parameters) {
        createNewScope();

        Function f = functions.get(name);
        createStaticVariable(new Variable(name, f.getReturnType()));
        parameters.forEach(par -> {
            if (par instanceof ArrayQB)
                createStaticVariable(par);
            else {
                if (sharedMemory.containsKey(par.getProperName()))
                    ignoredShared.peek().add(par.getProperName());
                createDynamicVariable(par);
            }
        });

        visitor.visit(f.getCtx());

        Variable returnValue = getStaticVariable(name);
        deleteScope();

        return returnValue;
    }

    public void callSub (String name, List<Variable> parameters) {
        createNewScope();

        Sub sub = subs.get(name);
        parameters.forEach(par -> {
            if (par instanceof ArrayQB)
                createStaticVariable(par);
            else {
                if (sharedMemory.containsKey(par.getProperName()))
                    ignoredShared.peek().add(par.getProperName());
                createDynamicVariable(par);
            }
        });

        visitor.visit(sub.getCtx());

        deleteScope();
    }

    public boolean eval (Variable v, Token token) {
        if (v.getType() == Value.Type.STRING)
            errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        return v.doubleValue() != 0;
    }

    public Sub getSub(String name) {
        return subs.get(name);
    }

    public Function getFunction(String name) {
        return functions.get(name);
    }
}
