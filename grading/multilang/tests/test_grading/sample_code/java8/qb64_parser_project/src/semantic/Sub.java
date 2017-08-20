package semantic;

import semantic.gen.QB64v3Parser;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by milderhc on 10/03/17.
 */
public class Sub {
    private QB64v3Parser.InstructionBlockContext ctx;
    private List<QB64v3Parser.FunprocParContext> parCtx;
    private List<Variable> parameters;

    public Sub(QB64v3Parser.InstructionBlockContext ctx, List<QB64v3Parser.FunprocParContext> parCtx, List<Variable> parameters) {
        this.ctx = ctx;
        this.parCtx = parCtx;
        this.parameters = parameters;
    }

    public QB64v3Parser.InstructionBlockContext getCtx() {
        return ctx;
    }

    public List<Variable> getParameters() {
        return parameters;
    }

    public void setParameters(List<Variable> parameters) {
        this.parameters = parameters;
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
