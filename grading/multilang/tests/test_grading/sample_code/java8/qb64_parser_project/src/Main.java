import semantic.QBInterpreter;

import java.io.IOException;

/**
 * Created by milderhc on 6/07/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        QBInterpreter interpreter = new QBInterpreter();
        interpreter.go(null);
    }
}
