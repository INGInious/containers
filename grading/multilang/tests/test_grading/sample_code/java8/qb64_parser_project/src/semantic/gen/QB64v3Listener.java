// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v3.g4 by ANTLR 4.6
package semantic.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QB64v3Parser}.
 */
public interface QB64v3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#qb}.
	 * @param ctx the parse tree
	 */
	void enterQb(QB64v3Parser.QbContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#qb}.
	 * @param ctx the parse tree
	 */
	void exitQb(QB64v3Parser.QbContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(QB64v3Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(QB64v3Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(QB64v3Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(QB64v3Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#dimId}.
	 * @param ctx the parse tree
	 */
	void enterDimId(QB64v3Parser.DimIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#dimId}.
	 * @param ctx the parse tree
	 */
	void exitDimId(QB64v3Parser.DimIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QB64v3Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QB64v3Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#callId}.
	 * @param ctx the parse tree
	 */
	void enterCallId(QB64v3Parser.CallIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#callId}.
	 * @param ctx the parse tree
	 */
	void exitCallId(QB64v3Parser.CallIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#singleId}.
	 * @param ctx the parse tree
	 */
	void enterSingleId(QB64v3Parser.SingleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#singleId}.
	 * @param ctx the parse tree
	 */
	void exitSingleId(QB64v3Parser.SingleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(QB64v3Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(QB64v3Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(QB64v3Parser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(QB64v3Parser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(QB64v3Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(QB64v3Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(QB64v3Parser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(QB64v3Parser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(QB64v3Parser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(QB64v3Parser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(QB64v3Parser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(QB64v3Parser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(QB64v3Parser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(QB64v3Parser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(QB64v3Parser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(QB64v3Parser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(QB64v3Parser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(QB64v3Parser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code potExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPotExpr(QB64v3Parser.PotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code potExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPotExpr(QB64v3Parser.PotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(QB64v3Parser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(QB64v3Parser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(QB64v3Parser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(QB64v3Parser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCmpExpr(QB64v3Parser.CmpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCmpExpr(QB64v3Parser.CmpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(QB64v3Parser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(QB64v3Parser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argExpr}
	 * labeled alternative in {@link QB64v3Parser#argExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgExpr(QB64v3Parser.ArgExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argExpr}
	 * labeled alternative in {@link QB64v3Parser#argExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgExpr(QB64v3Parser.ArgExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argArr}
	 * labeled alternative in {@link QB64v3Parser#argExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgArr(QB64v3Parser.ArgArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argArr}
	 * labeled alternative in {@link QB64v3Parser#argExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgArr(QB64v3Parser.ArgArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenArgExpr}
	 * labeled alternative in {@link QB64v3Parser#argExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenArgExpr(QB64v3Parser.ParenArgExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenArgExpr}
	 * labeled alternative in {@link QB64v3Parser#argExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenArgExpr(QB64v3Parser.ParenArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#callSub}.
	 * @param ctx the parse tree
	 */
	void enterCallSub(QB64v3Parser.CallSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#callSub}.
	 * @param ctx the parse tree
	 */
	void exitCallSub(QB64v3Parser.CallSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(QB64v3Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(QB64v3Parser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QB64v3Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QB64v3Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(QB64v3Parser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(QB64v3Parser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(QB64v3Parser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(QB64v3Parser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileBlock(QB64v3Parser.DoWhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileBlock(QB64v3Parser.DoWhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#doUntilBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoUntilBlock(QB64v3Parser.DoUntilBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#doUntilBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoUntilBlock(QB64v3Parser.DoUntilBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(QB64v3Parser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(QB64v3Parser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#selectBlock}.
	 * @param ctx the parse tree
	 */
	void enterSelectBlock(QB64v3Parser.SelectBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#selectBlock}.
	 * @param ctx the parse tree
	 */
	void exitSelectBlock(QB64v3Parser.SelectBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#instructionBlock}.
	 * @param ctx the parse tree
	 */
	void enterInstructionBlock(QB64v3Parser.InstructionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#instructionBlock}.
	 * @param ctx the parse tree
	 */
	void exitInstructionBlock(QB64v3Parser.InstructionBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void enterFunction(QB64v3Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void exitFunction(QB64v3Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void enterSub(QB64v3Parser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void exitSub(QB64v3Parser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleIdPar}
	 * labeled alternative in {@link QB64v3Parser#funprocPar}.
	 * @param ctx the parse tree
	 */
	void enterSingleIdPar(QB64v3Parser.SingleIdParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleIdPar}
	 * labeled alternative in {@link QB64v3Parser#funprocPar}.
	 * @param ctx the parse tree
	 */
	void exitSingleIdPar(QB64v3Parser.SingleIdParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayPar}
	 * labeled alternative in {@link QB64v3Parser#funprocPar}.
	 * @param ctx the parse tree
	 */
	void enterArrayPar(QB64v3Parser.ArrayParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayPar}
	 * labeled alternative in {@link QB64v3Parser#funprocPar}.
	 * @param ctx the parse tree
	 */
	void exitArrayPar(QB64v3Parser.ArrayParContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffix(QB64v3Parser.SuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffix(QB64v3Parser.SuffixContext ctx);
}