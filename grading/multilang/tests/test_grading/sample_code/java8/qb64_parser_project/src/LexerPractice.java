/**
 * Created by milderhc on 26/02/17.
 */

import lex.gen.QB64v1Lexer;
import lex.gen.QB64v1Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.*;

//import qb64v1parsing.*;

public class LexerPractice {

    private Set<String> keywords;
    private Map<String, String> operators;
    private Map<String, String> other_token;
    private String inputFilename, outputFilename;

    private void fillKeywords() {
        keywords = new TreeSet<>();
        keywords.add("input");
        keywords.add("print");
        keywords.add("if");
        keywords.add("then");
        keywords.add("else");
        keywords.add("while");
        keywords.add("wend");
        keywords.add("do");
        keywords.add("loop");
        keywords.add("until");
        keywords.add("for");
        keywords.add("to");
        keywords.add("step");
        keywords.add("next");
        keywords.add("integer");
        keywords.add("single");
        keywords.add("double");
        keywords.add("long");
        keywords.add("string");
        keywords.add("dim");
        keywords.add("as");
        keywords.add("end");
        keywords.add("sub");
        keywords.add("function");
        keywords.add("shared");
        keywords.add("const");
        keywords.add("select");
        keywords.add("case");
        keywords.add("elseif");
    }

    private void fillOperators() {
        operators = new TreeMap<>();
        operators.put("not", "token_neg");
        operators.put("=", "token_igual");
        operators.put("<>", "token_dif");
        operators.put("<", "token_menor");
        operators.put(">", "token_mayor");
        operators.put("<=", "token_menor_igual");
        operators.put(">=", "token_mayor_igual");
        operators.put("+", "token_mas");
        operators.put("-", "token_menos");
        operators.put("/", "token_div");
        operators.put("*", "token_mul");
        operators.put("mod", "token_mod");
        operators.put("(", "token_par_izq");
        operators.put(")", "token_par_der");
        operators.put("or", "token_o");
        operators.put("and", "token_y");
        operators.put("xor", "token_xor");
        operators.put(";", "token_pyc");
        operators.put(",", "token_coma");
        operators.put("^", "token_pot");

        operators.put("%", "token_porcentaje");
        operators.put("&", "token_ampersand");
        operators.put("!", "token_admiracion");
        operators.put("#", "token_numeral");
        operators.put("$", "token_pesos");
    }

    private void fillExtratokens() {
        other_token = new TreeMap<>();
        other_token.put("INTEGERVALUE", "token_integer");
        other_token.put("LONGVALUE", "token_long");
        other_token.put("SINGLEVALUE", "token_single");
        other_token.put("DOUBLEVALUE", "token_double");
        other_token.put("STRINGVALUE", "token_string");
        other_token.put("IDPREFIX", "id");
    }

    private String getToken(String str) throws Exception {
        if (other_token.containsKey(str))
            return other_token.get(str);

        throw new Exception("Undefined token, impossible to parse " + str);
    }

    private String identify(int type, Map<String, Integer> tokenType) throws Exception {
        for (Map.Entry<String, Integer> e : tokenType.entrySet()) {
            if (type == e.getValue())
                return getToken(e.getKey());
        }
        return "eof";
    }

    public void setNewFiles (String inputFilename, String outputFilename) {
        this.inputFilename = inputFilename;
        this.outputFilename = outputFilename;
    }

    public LexerPractice() {
        fillKeywords();
        fillOperators();
        fillExtratokens();
    }

    public String generateRandomString () {
        Random gen = new Random();
        StringBuilder builder = new StringBuilder();
        int size = gen.nextInt(50);

        for (int i = 0; i < size; ++i)
            builder.append(" ");
        builder.append("\"");
        size = gen.nextInt(100);
        for (int i = 0; i < size; ++i) {
            int r = gen.nextInt(90);
            if (r != 2 && r != 60)
                builder.append((char)(r + 32));
        }

        return builder.toString();
    }

    public void printRandomStrings (int size) {
        for (int i = 0; i < size; ++i)
            System.out.println(generateRandomString() + "\"");
    }

    public void generateOutput() throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFilename));
        QB64v1Lexer lexer = new QB64v1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QB64v1Parser parser = new QB64v1Parser(tokens);
        parser.qb();

        StringBuilder output = new StringBuilder();

        TokenStream inputStream = parser.getInputStream();
        for (int i = 0; i < inputStream.size(); ++i) {
            Token token = inputStream.get(i);

            //EOF type
            if (token.getType() == -1)
                break;

            String lexema = token.getText();
            String lexemaLower = lexema.toLowerCase();
            if (keywords.contains(lexemaLower))
                output.append("<" + lexemaLower);
            else if (operators.containsKey(lexemaLower))
                output.append("<" + operators.get(lexemaLower));
            else {
                try {
                    String tokenType = identify(token.getType(), parser.getTokenTypeMap());
                    output.append("<" + tokenType + "," +
                            (tokenType.equals("token_string") ? lexema.replaceAll("\"", "") : lexemaLower));
                } catch (Exception e) {
                    output.append(">>> Error lexico " +
                            "(linea: " + token.getLine() + ", posicion: " + (token.getCharPositionInLine() + 1) + ")\n");

                    PrintWriter writer = new PrintWriter(outputFilename, "UTF-8");
                    writer.print(output);
                    writer.close();

                    //Abort analysis
                    return;
                }
            }

            output.append("," + token.getLine() + "," + (token.getCharPositionInLine() + 1) + ">");
            output.append("\n");
        }

        PrintWriter writer = new PrintWriter(outputFilename, "UTF-8");
        writer.print(output);
        writer.close();
//        System.out.println(output);
    }

    private final static int[] SAMPLES = {5, 5, 4, 4, 8};
    private final static String directory = "lexer-test-cases/";
    private final static String inputPrefix = "in0";
    private final static String outputPrefix = "out0";
    private final static String extension = ".txt";

    public static void main(String[] args) throws Exception {
        LexerPractice lexerPractice = new LexerPractice();

        lexerPractice.setNewFiles("lexer-test-cases/single-input.txt", "lexer-test-cases/output.txt");
        lexerPractice.generateOutput();
        lexerPractice.printRandomStrings(200);
        for (char c = 'A'; c <= 'E'; ++c) {
            for (int i = 0; i < SAMPLES[(int)(c - 'A')]; ++i) {
                lexerPractice.setNewFiles(directory + "/" + String.valueOf(c) + "/"
                                + inputPrefix + i + extension,
                        directory + "/" + String.valueOf(c) + "/"
                                + outputPrefix + i + extension);
                lexerPractice.generateOutput();
            }
        }

    }
}
