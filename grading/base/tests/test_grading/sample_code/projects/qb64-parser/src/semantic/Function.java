package semantic;

import semantic.gen.QB64v3Parser;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by milderhc on 10/03/17.
 */
public class Function {
    private QB64v3Parser.InstructionBlockContext ctx;
    private Variable.Type returnType;
    private List<QB64v3Parser.FunprocParContext> parCtx;
    private List<Variable> parameters;

    public Function(QB64v3Parser.InstructionBlockContext ctx, List<QB64v3Parser.FunprocParContext> parCtx, List<Variable> parameters, Variable.Type returnType) {
        this.ctx = ctx;
        this.parCtx = parCtx;
        this.parameters = parameters;
        this.returnType = returnType;
    }

    public QB64v3Parser.InstructionBlockContext getCtx() {
        return ctx;
    }

    public void setCtx(QB64v3Parser.InstructionBlockContext ctx) {
        this.ctx = ctx;
    }

    public List<Variable> getParameters() {
        return parameters;
    }

    public Variable.Type getReturnType() {
        return returnType;
    }

    public List<QB64v3Parser.FunprocParContext> getParCtx() {
        return parCtx;
    }

    public List<Variable> getClonedParameters() {
        List<Variable> cloned = new LinkedList<>();
        parameters.forEach(par -> {
            if (par instanceof ArrayQB)
                cloned.add(new ArrayQB((ArrayQB) par));
            else
                cloned.add(new Variable(par));
        });
        return cloned;
    }
}
