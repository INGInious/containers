import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main{

	public static void main(String [] args) throws Exception{
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		PsiCoderLexer lexer = new PsiCoderLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PsiCoderParser parser = new PsiCoderParser(tokens);
		ParseTree tree = parser.programa();

		MyVisitor<Object> loader = new MyVisitor<Object>();
		loader.visit(tree);
	}
}