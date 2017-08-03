public class Symbol{
    
    public static final int FUNCTION = 0;
    public static final int ENTERO = 1;
    public static final int REAL = 2;
    public static final int BOOLEANO = 3;
    public static final int CARACTER = 4;
    public static final int CADENA = 5;
    
    String name;
    int row,col;
    int type;   
    int numberOfParameters; 
    Object value;
    
    Symbol(){}
    
    Symbol(String name , int row , int col , int type, Object value){
        this.name = name;
        this.row = row;
        this.col = col;
        this.type = type;
        this.value = value;
    }
    
    Symbol(String name , int row , int col , int numberOfParameters){
        this(name,row,col,FUNCTION,null);
        this.numberOfParameters = numberOfParameters;
    }   
}