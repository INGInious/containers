import java.util.*;

public class Table{
    Table parent;
    Map<String,Symbol> table;
    
    
    Table(Table parent){
        this.parent = parent;
        table = new HashMap<String,Symbol>();
    }
    
    public boolean addSymbol(Symbol symbol){
        boolean success = true;
        if(table.containsKey(symbol.name))
            success = false;
        else
            table.put(symbol.name,symbol);
        return success;
    }
    
    
    public Symbol getSymbol(String name){
        Symbol ans;
        ans = table.get(name);
    	if(ans==null && parent != null)
    		ans = parent.getSymbol(name);
        return ans;
    }
    
}