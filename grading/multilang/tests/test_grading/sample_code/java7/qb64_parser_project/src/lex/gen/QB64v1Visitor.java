// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v1.g4 by ANTLR 4.6
package lex.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QB64v1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QB64v1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#qb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQb(QB64v1Parser.QbContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(QB64v1Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(QB64v1Parser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(QB64v1Parser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(QB64v1Parser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QB64v1Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#print_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_list(QB64v1Parser.Print_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(QB64v1Parser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(QB64v1Parser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(QB64v1Parser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#do_until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_until(QB64v1Parser.Do_untilContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(QB64v1Parser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#select_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_(QB64v1Parser.Select_Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#cases_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases_list(QB64v1Parser.Cases_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(QB64v1Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(QB64v1Parser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#const_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_declaration(QB64v1Parser.Const_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#const_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_declaration_list(QB64v1Parser.Const_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(QB64v1Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#single_numeric_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_numeric_assignment(QB64v1Parser.Single_numeric_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#array_numeric_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_numeric_assignment(QB64v1Parser.Array_numeric_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QB64v1Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#single_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id(QB64v1Parser.Single_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_numeric_id(QB64v1Parser.Single_numeric_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#array_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id(QB64v1Parser.Array_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#array_numeric_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_numeric_id(QB64v1Parser.Array_numeric_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#array_id_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id_int(QB64v1Parser.Array_id_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#array_id_long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id_long(QB64v1Parser.Array_id_longContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#array_id_single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id_single(QB64v1Parser.Array_id_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#array_id_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id_double(QB64v1Parser.Array_id_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#array_id_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id_string(QB64v1Parser.Array_id_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#single_id_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id_int(QB64v1Parser.Single_id_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#single_id_long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id_long(QB64v1Parser.Single_id_longContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#single_id_single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id_single(QB64v1Parser.Single_id_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#single_id_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id_double(QB64v1Parser.Single_id_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#single_id_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id_string(QB64v1Parser.Single_id_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(QB64v1Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(QB64v1Parser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QB64v1Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QB64v1Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#numeric_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_value(QB64v1Parser.Numeric_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#string_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value(QB64v1Parser.String_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QB64v1Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#funproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunproc(QB64v1Parser.FunprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_sub(QB64v1Parser.Call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(QB64v1Parser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#parameters_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list(QB64v1Parser.Parameters_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#negop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegop(QB64v1Parser.NegopContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#compop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompop(QB64v1Parser.CompopContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(QB64v1Parser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v1Parser#proop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProop(QB64v1Parser.ProopContext ctx);
}