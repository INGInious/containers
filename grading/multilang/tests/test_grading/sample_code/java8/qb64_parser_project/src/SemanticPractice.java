import semantic.QBInterpreter;

import java.io.IOException;

public class SemanticPractice {
    public static void main(String[] args) throws IOException {
        QBInterpreter interpreter = new QBInterpreter();
//        interpreter.go("semantic-test-cases/test-input.txt");

        String input = "semantic-test-cases/test-cases/in09.txt";
        interpreter.go(input);
//        System.setOut(new PrintStream(new File("semantic-test-cases/test-cases/out09.txt")));
//        interpreter.go(input);
    }
}






