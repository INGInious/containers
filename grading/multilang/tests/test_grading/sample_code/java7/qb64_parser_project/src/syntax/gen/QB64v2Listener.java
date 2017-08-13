// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v2.g4 by ANTLR 4.6
package syntax.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QB64v2Parser}.
 */
public interface QB64v2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#qb}.
	 * @param ctx the parse tree
	 */
	void enterQb(QB64v2Parser.QbContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#qb}.
	 * @param ctx the parse tree
	 */
	void exitQb(QB64v2Parser.QbContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(QB64v2Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(QB64v2Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(QB64v2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(QB64v2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#declaration1}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration1(QB64v2Parser.Declaration1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#declaration1}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration1(QB64v2Parser.Declaration1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#dim_id}.
	 * @param ctx the parse tree
	 */
	void enterDim_id(QB64v2Parser.Dim_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#dim_id}.
	 * @param ctx the parse tree
	 */
	void exitDim_id(QB64v2Parser.Dim_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(QB64v2Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(QB64v2Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#dim_id_list}.
	 * @param ctx the parse tree
	 */
	void enterDim_id_list(QB64v2Parser.Dim_id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#dim_id_list}.
	 * @param ctx the parse tree
	 */
	void exitDim_id_list(QB64v2Parser.Dim_id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#dim_id_list1}.
	 * @param ctx the parse tree
	 */
	void enterDim_id_list1(QB64v2Parser.Dim_id_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#dim_id_list1}.
	 * @param ctx the parse tree
	 */
	void exitDim_id_list1(QB64v2Parser.Dim_id_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#single_id}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id(QB64v2Parser.Single_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#single_id}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id(QB64v2Parser.Single_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 */
	void enterSingle_numeric_id(QB64v2Parser.Single_numeric_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 */
	void exitSingle_numeric_id(QB64v2Parser.Single_numeric_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QB64v2Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QB64v2Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffix(QB64v2Parser.SuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffix(QB64v2Parser.SuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#non_empty_suffix}.
	 * @param ctx the parse tree
	 */
	void enterNon_empty_suffix(QB64v2Parser.Non_empty_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#non_empty_suffix}.
	 * @param ctx the parse tree
	 */
	void exitNon_empty_suffix(QB64v2Parser.Non_empty_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#numeric_suffix}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_suffix(QB64v2Parser.Numeric_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#numeric_suffix}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_suffix(QB64v2Parser.Numeric_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#arg_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_expression_list(QB64v2Parser.Arg_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#arg_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_expression_list(QB64v2Parser.Arg_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#arg_expression_list1}.
	 * @param ctx the parse tree
	 */
	void enterArg_expression_list1(QB64v2Parser.Arg_expression_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#arg_expression_list1}.
	 * @param ctx the parse tree
	 */
	void exitArg_expression_list1(QB64v2Parser.Arg_expression_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(QB64v2Parser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(QB64v2Parser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#expression_list1}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list1(QB64v2Parser.Expression_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#expression_list1}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list1(QB64v2Parser.Expression_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#constdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstdeclaration(QB64v2Parser.ConstdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#constdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstdeclaration(QB64v2Parser.ConstdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#constdeclaration1}.
	 * @param ctx the parse tree
	 */
	void enterConstdeclaration1(QB64v2Parser.Constdeclaration1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#constdeclaration1}.
	 * @param ctx the parse tree
	 */
	void exitConstdeclaration1(QB64v2Parser.Constdeclaration1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#idblock}.
	 * @param ctx the parse tree
	 */
	void enterIdblock(QB64v2Parser.IdblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#idblock}.
	 * @param ctx the parse tree
	 */
	void exitIdblock(QB64v2Parser.IdblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#idblock1}.
	 * @param ctx the parse tree
	 */
	void enterIdblock1(QB64v2Parser.Idblock1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#idblock1}.
	 * @param ctx the parse tree
	 */
	void exitIdblock1(QB64v2Parser.Idblock1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#idblock2}.
	 * @param ctx the parse tree
	 */
	void enterIdblock2(QB64v2Parser.Idblock2Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#idblock2}.
	 * @param ctx the parse tree
	 */
	void exitIdblock2(QB64v2Parser.Idblock2Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#idblock3}.
	 * @param ctx the parse tree
	 */
	void enterIdblock3(QB64v2Parser.Idblock3Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#idblock3}.
	 * @param ctx the parse tree
	 */
	void exitIdblock3(QB64v2Parser.Idblock3Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#idblock6}.
	 * @param ctx the parse tree
	 */
	void enterIdblock6(QB64v2Parser.Idblock6Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#idblock6}.
	 * @param ctx the parse tree
	 */
	void exitIdblock6(QB64v2Parser.Idblock6Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#idblock7}.
	 * @param ctx the parse tree
	 */
	void enterIdblock7(QB64v2Parser.Idblock7Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#idblock7}.
	 * @param ctx the parse tree
	 */
	void exitIdblock7(QB64v2Parser.Idblock7Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#arg_expression}.
	 * @param ctx the parse tree
	 */
	void enterArg_expression(QB64v2Parser.Arg_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#arg_expression}.
	 * @param ctx the parse tree
	 */
	void exitArg_expression(QB64v2Parser.Arg_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#arg_expression1}.
	 * @param ctx the parse tree
	 */
	void enterArg_expression1(QB64v2Parser.Arg_expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#arg_expression1}.
	 * @param ctx the parse tree
	 */
	void exitArg_expression1(QB64v2Parser.Arg_expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#arg_expression2}.
	 * @param ctx the parse tree
	 */
	void enterArg_expression2(QB64v2Parser.Arg_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#arg_expression2}.
	 * @param ctx the parse tree
	 */
	void exitArg_expression2(QB64v2Parser.Arg_expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QB64v2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QB64v2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(QB64v2Parser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(QB64v2Parser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(QB64v2Parser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(QB64v2Parser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(QB64v2Parser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(QB64v2Parser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(QB64v2Parser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(QB64v2Parser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(QB64v2Parser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(QB64v2Parser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#elseblock}.
	 * @param ctx the parse tree
	 */
	void enterElseblock(QB64v2Parser.ElseblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#elseblock}.
	 * @param ctx the parse tree
	 */
	void exitElseblock(QB64v2Parser.ElseblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#forblock}.
	 * @param ctx the parse tree
	 */
	void enterForblock(QB64v2Parser.ForblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#forblock}.
	 * @param ctx the parse tree
	 */
	void exitForblock(QB64v2Parser.ForblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(QB64v2Parser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(QB64v2Parser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#whileblock}.
	 * @param ctx the parse tree
	 */
	void enterWhileblock(QB64v2Parser.WhileblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#whileblock}.
	 * @param ctx the parse tree
	 */
	void exitWhileblock(QB64v2Parser.WhileblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#dosomethingblock}.
	 * @param ctx the parse tree
	 */
	void enterDosomethingblock(QB64v2Parser.DosomethingblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#dosomethingblock}.
	 * @param ctx the parse tree
	 */
	void exitDosomethingblock(QB64v2Parser.DosomethingblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#doblocks}.
	 * @param ctx the parse tree
	 */
	void enterDoblocks(QB64v2Parser.DoblocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#doblocks}.
	 * @param ctx the parse tree
	 */
	void exitDoblocks(QB64v2Parser.DoblocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#selectblock}.
	 * @param ctx the parse tree
	 */
	void enterSelectblock(QB64v2Parser.SelectblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#selectblock}.
	 * @param ctx the parse tree
	 */
	void exitSelectblock(QB64v2Parser.SelectblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#case_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_list(QB64v2Parser.Case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#case_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_list(QB64v2Parser.Case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#case_list1}.
	 * @param ctx the parse tree
	 */
	void enterCase_list1(QB64v2Parser.Case_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#case_list1}.
	 * @param ctx the parse tree
	 */
	void exitCase_list1(QB64v2Parser.Case_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#function_sub}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sub(QB64v2Parser.Function_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#function_sub}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sub(QB64v2Parser.Function_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list(QB64v2Parser.Parameters_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list(QB64v2Parser.Parameters_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#parameters_list1}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list1(QB64v2Parser.Parameters_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#parameters_list1}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list1(QB64v2Parser.Parameters_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#parameters_list2}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list2(QB64v2Parser.Parameters_list2Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#parameters_list2}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list2(QB64v2Parser.Parameters_list2Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#parameters_list3}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list3(QB64v2Parser.Parameters_list3Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#parameters_list3}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list3(QB64v2Parser.Parameters_list3Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list(QB64v2Parser.Arguments_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list(QB64v2Parser.Arguments_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#arguments_list1}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list1(QB64v2Parser.Arguments_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#arguments_list1}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list1(QB64v2Parser.Arguments_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(QB64v2Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(QB64v2Parser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(QB64v2Parser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(QB64v2Parser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QB64v2Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QB64v2Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#print1}.
	 * @param ctx the parse tree
	 */
	void enterPrint1(QB64v2Parser.Print1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#print1}.
	 * @param ctx the parse tree
	 */
	void exitPrint1(QB64v2Parser.Print1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QB64v2Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QB64v2Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(QB64v2Parser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(QB64v2Parser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(QB64v2Parser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(QB64v2Parser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QB64v2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QB64v2Parser.TypeContext ctx);
}