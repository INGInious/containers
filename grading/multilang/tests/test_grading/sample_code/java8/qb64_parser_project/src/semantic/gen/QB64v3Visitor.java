// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v3.g4 by ANTLR 4.6
package semantic.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QB64v3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QB64v3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#qb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQb(QB64v3Parser.QbContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(QB64v3Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(QB64v3Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#dimId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimId(QB64v3Parser.DimIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QB64v3Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#callId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallId(QB64v3Parser.CallIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#singleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleId(QB64v3Parser.SingleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(QB64v3Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(QB64v3Parser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(QB64v3Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(QB64v3Parser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(QB64v3Parser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(QB64v3Parser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(QB64v3Parser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(QB64v3Parser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(QB64v3Parser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotExpr(QB64v3Parser.PotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(QB64v3Parser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(QB64v3Parser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExpr(QB64v3Parser.CmpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(QB64v3Parser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argExpr}
	 * labeled alternative in {@link QB64v3Parser#argExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgExpr(QB64v3Parser.ArgExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argArr}
	 * labeled alternative in {@link QB64v3Parser#argExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgArr(QB64v3Parser.ArgArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenArgExpr}
	 * labeled alternative in {@link QB64v3Parser#argExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenArgExpr(QB64v3Parser.ParenArgExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#callSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSub(QB64v3Parser.CallSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(QB64v3Parser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QB64v3Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(QB64v3Parser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(QB64v3Parser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#doWhileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileBlock(QB64v3Parser.DoWhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#doUntilBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoUntilBlock(QB64v3Parser.DoUntilBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(QB64v3Parser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#selectBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectBlock(QB64v3Parser.SelectBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#instructionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionBlock(QB64v3Parser.InstructionBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QB64v3Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(QB64v3Parser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleIdPar}
	 * labeled alternative in {@link QB64v3Parser#funprocPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleIdPar(QB64v3Parser.SingleIdParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayPar}
	 * labeled alternative in {@link QB64v3Parser#funprocPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayPar(QB64v3Parser.ArrayParContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffix(QB64v3Parser.SuffixContext ctx);
}