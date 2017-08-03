// Generated from PsiCoder.g by ANTLR 4.5.3
import java.util.HashMap;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link PsiCoderVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MyVisitor<T> extends AbstractParseTreeVisitor<T> implements PsiCoderVisitor<T> {
	
	HashMap<String,String> words = new HashMap<String,String>();
	
	MyVisitor(){
		words.put("entero", "int");
		words.put("real", "double");
		words.put("cadena", "string");
		words.put("booleano", "bool");
		words.put("caracter", "char");
		words.put("verdadero", "true");
		words.put("falso", "false");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrograma(PsiCoderParser.ProgramaContext ctx) { 
		System.out.println("#include <bits/stdc++.h>");
			
		visitDeclaracionesExternas(ctx.declaracionesExternas(0));
		
		System.out.println("int main(){");
		visitComandos(ctx.comandos());
		System.out.println("}");
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaracionesExternas(PsiCoderParser.DeclaracionesExternasContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFuncionN(PsiCoderParser.FuncionNContext ctx) { 
		visitTipo(ctx.tipo());
		System.out.print(" ");
		visitIdentificadorDeclaracion(ctx.identificadorDeclaracion());
		System.out.print("(");
		visitParametros(ctx.parametros());
		System.out.println(") {");
		visitComandos(ctx.comandos());
		System.out.print("return ");
		visitExpresion(ctx.expresion());
		System.out.println(";");
		System.out.println("}");
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEstructuraN(PsiCoderParser.EstructuraNContext ctx) { 
		
		System.out.print("struct ");
	 	visitIdentificadorDeclaracion(ctx.identificadorDeclaracion());
	 	System.out.println("{");
	 	visitDeclaraciones(ctx.declaraciones());
	 	System.out.println("};");
	 	return null;
	 	
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaraciones(PsiCoderParser.DeclaracionesContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaracion(PsiCoderParser.DeclaracionContext ctx) { 
		visitTipo(ctx.tipo());
		System.out.print(" ");
		visitIdentificadorDeclaracion(ctx.identificadorDeclaracion());
		visitAsignador(ctx.asignador());
		visitDeclaracionesMultiples(ctx.declaracionesMultiples());
		System.out.println(";");
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaracionesMultiples(PsiCoderParser.DeclaracionesMultiplesContext ctx) { 
		if(ctx.identificadorDeclaracion()!=null){
			System.out.print(", ");
			visitIdentificadorDeclaracion(ctx.identificadorDeclaracion());
			visitAsignador(ctx.asignador());
			visitDeclaracionesMultiples(ctx.declaracionesMultiples());
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@SuppressWarnings("unchecked")
	@Override public T visitDeclaracion2(PsiCoderParser.Declaracion2Context ctx) { 
		System.out.print(words.get(ctx.TIPO2().toString())+" ");
		visitChildren(ctx);
		return (T) ctx.identificadorDeclaracion().ID() ;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaracion2Aux(PsiCoderParser.Declaracion2AuxContext ctx) { 
		if(ctx.identificador()!=null){
			System.out.print(" ");
			visitIdentificador(ctx.identificador());
			visitAsignador(ctx.asignador());
			visitDeclaracionesMultiples(ctx.declaracionesMultiples());
		}else{
			System.out.print(" = ");
			visitExpresion(ctx.expresion());
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAsignador(PsiCoderParser.AsignadorContext ctx) { 
		
		if(ctx.expresion()!=null){
			System.out.print("=");
			visitExpresion(ctx.expresion());
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParametros(PsiCoderParser.ParametrosContext ctx) { 
		if(ctx.tipo()!=null){
			visitTipo(ctx.tipo());
			System.out.print(" ");
			visitIdentificadorDeclaracion(ctx.identificadorDeclaracion());
			visitParametrosMultiples(ctx.parametrosMultiples());
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParametrosMultiples(PsiCoderParser.ParametrosMultiplesContext ctx) { 
		if(ctx.TK_COMA()!=null){
			System.out.print(", ");
			visitTipo(ctx.tipo());
			System.out.print(" ");
			visitIdentificadorDeclaracion(ctx.identificadorDeclaracion());
			visitParametrosMultiples(ctx.parametrosMultiples());
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTipo(PsiCoderParser.TipoContext ctx) { 
		if(ctx.TIPO2()!=null) 
			System.out.print( words.get(ctx.TIPO2().toString()) );
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIdentificadorDeclaracion(PsiCoderParser.IdentificadorDeclaracionContext ctx) { 
		System.out.print(ctx.ID());
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@SuppressWarnings("unchecked")
	@Override public T visitIdentificador(PsiCoderParser.IdentificadorContext ctx) { 
		System.out.print(ctx.ID());
		if(ctx.identificadorEstructura()!=null){
			visitIdentificadorEstructura(ctx.identificadorEstructura());
		}
		return (T)ctx.ID();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIdentificadorEstructura(PsiCoderParser.IdentificadorEstructuraContext ctx) { 
		if(ctx.TK_PUNTO()!=null){
			System.out.print(".");
			System.out.print(ctx.ID());
			visitIdentificadorEstructura(ctx.identificadorEstructura());
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLexemaConcreto(PsiCoderParser.LexemaConcretoContext ctx) { 
		
		if (ctx.TK_BOOLEANO()!=null) System.out.print(ctx.TK_BOOLEANO());
		else if(ctx.TK_ENTERO()!=null) System.out.print(ctx.TK_ENTERO());
		else if(ctx.TK_CADENA()!=null) System.out.print(ctx.TK_CADENA());
		else if(ctx.TK_REAL()!=null) System.out.print(ctx.TK_REAL());
		else if (ctx.TK_CARACTER()!=null) System.out.print(ctx.TK_CARACTER());
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpresion(PsiCoderParser.ExpresionContext ctx) { 
		if(ctx.expresionBooleana()!=null){
			visitExpresionBooleana(ctx.expresionBooleana());
		}else{
			visitExpresion(ctx.expresion(0));
			System.out.print(" "+ctx.TK_OR()+" ");
			visitExpresion(ctx.expresion(1));
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpresionBooleana(PsiCoderParser.ExpresionBooleanaContext ctx) { 
		if(ctx.expresionRelacional1()!=null){
			visitExpresionRelacional1(ctx.expresionRelacional1());
		}else{
			visitExpresionBooleana(ctx.expresionBooleana(0));
			System.out.print(" "+ctx.TK_AND()+" ");
			visitExpresionBooleana(ctx.expresionBooleana(1));
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpresionRelacional1(PsiCoderParser.ExpresionRelacional1Context ctx) { 
		
		if(ctx.expresionRelacional()!=null){
			visitExpresionRelacional(ctx.expresionRelacional());
		}else if(ctx.expresionRelacional1(0)!=null){
			visitExpresionRelacional1(ctx.expresionRelacional1(0));
			System.out.print(" "+ctx.TK_IGUALDAD()+" ");
			visitExpresionRelacional1(ctx.expresionRelacional1(1));
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpresionRelacional(PsiCoderParser.ExpresionRelacionalContext ctx) { 
		
		if(ctx.expresionAritmetica1()!=null){
			visitExpresionAritmetica1(ctx.expresionAritmetica1());
		}else{
			visitExpresionRelacional(ctx.expresionRelacional(0));
			System.out.print(ctx.TK_COMPARACION());
			visitExpresionRelacional(ctx.expresionRelacional(1));
		}
		
		return null; 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpresionAritmetica1(PsiCoderParser.ExpresionAritmetica1Context ctx) {
		
		if(ctx.expresionAritmetica()!=null){
			visitExpresionAritmetica(ctx.expresionAritmetica());
		}else{
			visitExpresionAritmetica1(ctx.expresionAritmetica1(0));
			System.out.print(ctx.TK_SUMA());
			visitExpresionAritmetica1(ctx.expresionAritmetica1(1));
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpresionAritmetica(PsiCoderParser.ExpresionAritmeticaContext ctx) { 
		
		if(ctx.expresionUnaria()!=null){
			visitExpresionUnaria(ctx.expresionUnaria());
		}else{
			visitExpresionAritmetica(ctx.expresionAritmetica(0));
			System.out.print(ctx.TK_MULT());
			visitExpresionAritmetica(ctx.expresionAritmetica(1));
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpresionUnaria(PsiCoderParser.ExpresionUnariaContext ctx) { 
		if(ctx.TK_SUMA()!=null) System.out.print(" "+ctx.TK_SUMA());
		if(ctx.TK_DIFERENTE()!=null) System.out.print(ctx.TK_DIFERENTE());
		visitExpresionBasica(ctx.expresionBasica());
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpresionBasica(PsiCoderParser.ExpresionBasicaContext ctx) { 
		
		if(ctx.TK_CARACTER()!=null) System.out.print(ctx.TK_CARACTER());
		else if(ctx.TK_REAL()!=null) System.out.print(ctx.TK_REAL());
		else if(ctx.TK_ENTERO()!=null) System.out.print(ctx.TK_ENTERO());
		else if(ctx.TK_BOOLEANO()!=null) System.out.print(words.get(ctx.TK_BOOLEANO().toString()));
		else if(ctx.TK_CADENA() != null) System.out.print("std::string (" + ctx.TK_CADENA() + ")" );
		
		
		else if(ctx.expresion()!=null){
			System.out.print("(");
			visitExpresion(ctx.expresion());
			System.out.print(")");
		}
		
		else if(ctx.auxiliarExpresionBasica()!=null){
			visitAuxiliarExpresionBasica(ctx.auxiliarExpresionBasica());
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAuxiliarExpresionBasica(PsiCoderParser.AuxiliarExpresionBasicaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAuxiliarExpresionBasica2(PsiCoderParser.AuxiliarExpresionBasica2Context ctx) {
		if(ctx.TK_PI()!=null){
			System.out.print("(");
			visitValores(ctx.valores());
			System.out.print(")");
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitComandos(PsiCoderParser.ComandosContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitComando(PsiCoderParser.ComandoContext ctx) { 
		if(ctx.declaracion2()!=null){
			visitDeclaracion2(ctx.declaracion2());
			System.out.println(";");
		}else if(ctx.auxiliarComando()!=null){
			visitAuxiliarComando(ctx.auxiliarComando());
			System.out.println(";");
		}else if(ctx.funcionEspecial()!=null){
			visitFuncionEspecial(ctx.funcionEspecial());
		}else if(ctx.condicional()!=null){
			visitCondicional(ctx.condicional());
		}else if(ctx.cicloWhile()!=null){
			visitCicloWhile(ctx.cicloWhile());
		} else if(ctx.cicloPara()!=null){
			visitCicloPara(ctx.cicloPara());
		} else if(ctx.TK_ROMPER() != null ){
			System.out.println("break;");
		} else if(ctx.cicloDoWhile() != null){
			visitCicloDoWhile(ctx.cicloDoWhile());
		} else if(ctx.seleccionador()!=null){
			visitSeleccionador(ctx.seleccionador());
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAuxiliarComando(PsiCoderParser.AuxiliarComandoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAuxiliarComando2(PsiCoderParser.AuxiliarComando2Context ctx) { 
		if(ctx.TK_PD()!=null){
			System.out.print("(");
			visitValores(ctx.valores());
			System.out.print(")");
		}else{
			visitDeclaracion2Aux(ctx.declaracion2Aux());
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFuncionEspecial(PsiCoderParser.FuncionEspecialContext ctx) {
		if(ctx.identificador()!=null){
			System.out.print("std::cin>>");
			visitIdentificador(ctx.identificador());
			System.out.println(";");
		}else{
			System.out.print("std::cout<<");
			visitValoresImprimir(ctx.valoresImprimir());
			System.out.println(";");
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCondicional(PsiCoderParser.CondicionalContext ctx) { 
		
		System.out.print("if (");
		visitExpresion(ctx.expresion());
		System.out.println("){");
		visitComandos(ctx.comandos());
		System.out.println("}");
		
		visitElseNonTerminal(ctx.elseNonTerminal());
		
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitElseNonTerminal(PsiCoderParser.ElseNonTerminalContext ctx) { 
		if(ctx.comandos()!=null){
			System.out.println("else {");
			visitComandos(ctx.comandos());
			System.out.println("}");
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValores(PsiCoderParser.ValoresContext ctx) { 
		if(ctx.expresion()!=null){
			visitChildren(ctx);
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValoresImprimir(PsiCoderParser.ValoresImprimirContext ctx) { 
		return visitChildren(ctx); 
	}
	
	
	
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValoresMultiples(PsiCoderParser.ValoresMultiplesContext ctx) { 
		if(ctx.TK_COMA()!=null){
			System.out.print(",");
			visitExpresion(ctx.expresion());
			visitValoresMultiples(ctx.valoresMultiples());
		}
			
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCicloWhile(PsiCoderParser.CicloWhileContext ctx) {
		System.out.print("while (");
		visitExpresion(ctx.expresion());
		System.out.println("){");
		visitComandos(ctx.comandos());
		System.out.println("}");
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCicloDoWhile(PsiCoderParser.CicloDoWhileContext ctx) { 
		System.out.println("do {");
		visitComandos(ctx.comandos());
		System.out.print("} while(");
		visitExpresion(ctx.expresion());
		System.out.println(");");
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCicloPara(PsiCoderParser.CicloParaContext ctx) { 
		
		System.out.print("for (");
		T id = visitDeclaracionFor(ctx.declaracionFor());
		System.out.print(" ; ");
		visitExpresion(ctx.expresion());
		System.out.print(" ; ");
		System.out.print(id+" += ");
		visitExpresionAritmetica1(ctx.expresionAritmetica1());
		System.out.println("){");
		visitComandos(ctx.comandos());
		System.out.println("}");
	
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSeleccionador(PsiCoderParser.SeleccionadorContext ctx) { 
		System.out.print("switch (");
		visitIdentificador(ctx.identificador());
		System.out.println("){");
		visitAuxiliarCasos(ctx.auxiliarCasos());
		System.out.println("}");
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaracionFor(PsiCoderParser.DeclaracionForContext ctx) { 
		T ans;
		if(ctx.identificador()!=null){
			ans = visitIdentificador(ctx.identificador());
			System.out.print("=");
			visitExpresion(ctx.expresion());
		}else{
			ans = visitDeclaracion2(ctx.declaracion2());
		}
		return ans;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAuxiliarCasos(PsiCoderParser.AuxiliarCasosContext ctx) { 

		if(ctx.auxiliarCasos3()!=null){
			visitAuxiliarCasos3(ctx.auxiliarCasos3());
		}else{
			System.out.print("case ");	
			visitLexemaConcreto(ctx.lexemaConcreto());
			System.out.println(":");
			visitComandos(ctx.comandos());
			visitOpcionalRomper(ctx.opcionalRomper());
			visitAuxiliarCasos2(ctx.auxiliarCasos2());
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAuxiliarCasos2(PsiCoderParser.AuxiliarCasos2Context ctx) {
		
		if(ctx.auxiliarCasos3()!=null){
			visitAuxiliarCasos3(ctx.auxiliarCasos3());
		}else if(ctx.lexemaConcreto()!=null ){
			System.out.print("case ");	
			visitLexemaConcreto(ctx.lexemaConcreto());
			System.out.println(":");
			visitComandos(ctx.comandos());
			visitOpcionalRomper(ctx.opcionalRomper());
			visitAuxiliarCasos2(ctx.auxiliarCasos2());
		}
		
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAuxiliarCasos3(PsiCoderParser.AuxiliarCasos3Context ctx) { 
		
		System.out.println("default :");
		visitComandos(ctx.comandos());
		visitOpcionalRomper(ctx.opcionalRomper());
	
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOpcionalRomper(PsiCoderParser.OpcionalRomperContext ctx) { 
		
		if(ctx.TK_ROMPER()!=null){
			System.out.println("break;");
		}
		
		return null;
	}

	@Override
	public T visitValoresMultiplesImprimir(PsiCoderParser.ValoresMultiplesImprimirContext ctx) {
		
		if(ctx.TK_COMA()!=null){
			System.out.print("<<");
			visitExpresion(ctx.expresion());
			visitValoresMultiplesImprimir(ctx.valoresMultiplesImprimir());
		}
			
		return null;
	}


}