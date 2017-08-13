package semantic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by milderhc on 13/03/17.
 */
public class SemanticErrorHandler {

    private final String ERROR_PREFIX = " Error semantico: ";

    public void error (int line, int column, String message) {
        ++column;
        System.out.println("<" + line + "," + column + ">" + ERROR_PREFIX + message);
        System.exit(-1);
    }

    public void incompatibleTypesError (int line, int column, List<Value.Type> expected, Value.Type found) {
        StringBuilder errorMessage = new StringBuilder("tipos de datos incompatibles. Se esperaba: ");
        for (int i = 0; i < expected.size(); ++i) {
            if (i > 0) errorMessage.append(", ");
            errorMessage.append(typeString(expected.get(i)));
        }
        errorMessage.append("; se encontro: " + typeString(found) + ".");
        error(line, column, errorMessage.toString());
    }

    public void incompatibleIntegerError (int line, int column, Value.Type found) {
        List<Value.Type> expectedList = new ArrayList<>();
        expectedList.add(Value.Type.INTEGER);
        expectedList.add(Value.Type.LONG);
        incompatibleTypesError(line, column, expectedList, found);
    }

    public void incompatibleNumericError (int line, int column) {
        List<Value.Type> expectedList = new ArrayList<>();
        expectedList.add(Value.Type.DOUBLE);
        expectedList.add(Value.Type.INTEGER);
        expectedList.add(Value.Type.LONG);
        expectedList.add(Value.Type.SINGLE);
        incompatibleTypesError(line, column, expectedList, Value.Type.STRING);
    }

    public void callingSub (int line, int column, String name) {
        error(line, column, "'" + name + "' es un procedimiento, no tiene valor de retorno.");
    }

    public void incompatibleStringError (int line, int column, Value.Type found) {
        List<Value.Type> expectedList = new ArrayList<>();
        expectedList.add(Value.Type.STRING);
        incompatibleTypesError(line, column, expectedList, found);
    }

    public void idAlreadyDeclaredError (int line, int column, String name) {
        error(line, column, "'" + name + "' ya ha sido declarado.");
    }

    public void arrayAlreadyDeclaredError (int line, int column, String name) {
        error(line, column, "El arreglo '" + name + "' ya ha sido declarado.");
    }

    public void constAssignmentError (int line, int column, String name) {
        error(line, column, "'" + name + "' no puede ser modificado.");
    }

    public String typeString (Value.Type type) {
        switch (type) {
            case INTEGER:
                return "integer";
            case LONG:
                return "long";
            case SINGLE:
                return "single";
            case DOUBLE:
                return "double";
            case STRING:
                return "string";
            default:
                return "TYPE NOT SUPPORTED";
        }
    }

    public void indexOutOfBounds(int line, int column, int pos) {
        error(line, column, "se accedio a una posicion no valida del arreglo: " + pos + ".");
    }

    public void subNotDeclared(int line, int column, String name) {
        error(line, column, "el procedimiento '" + name + "' no ha sido declarado.");
    }

    public void arrayNotDeclared(int line, int column, String name) {
        error(line, column, "el arreglo '" + name + "' no hay sido declarado.");
    }

    public void incorrectNumberOfParametersSub(int line, int column, String name) {
        error(line, column, "numero incorrecto de parametros al llamar el procedimiento '" + name + "'.");
    }

    public void incorrectNumberOfParametersFunction(int line, int column, String name) {
        error(line, column, "numero incorrecto de parametros al llamar la funcion '" + name + "'.");
    }

    public void incompatibleArrayError(int line, int column, Value.Type type) {
        error(line, column, "tipos de datos incompatibles. Se esperaba: arreglo; se encontro: " + typeString(type) + ".");
    }

    public void incompatibleSingleNumericVariableError(int line, int column) {
        error(line, column, "tipos de datos incompatibles. Se esperaba: double, integer, long, single; se encontro: arreglo.");
    }

    public void incompatibleSingleStringVariableError(int line, int column) {
        error(line, column, "tipos de datos incompatibles. Se esperaba: string; se encontro: arreglo.");
    }

    public void incorrectNumberOfDimensions(int line, int column, String name) {
        error(line, column, "las dimensiones del arreglo '" + name.substring(0, name.length() - 1) + "' no son las especificadas.");
    }

    public void divisionByZeroError(int line, int column) {
        error(line, column, "division por cero.");
    }
}

