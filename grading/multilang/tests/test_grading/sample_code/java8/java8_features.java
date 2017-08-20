/*
 * Test file to test Java 8 specific features
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class Main{

    @FunctionalInterface
    interface Greetings {
        public void sayHello(String name);
    }

    public static void main(String[] args) {
		Greetings greetingsInstance = str -> System.out.println(str);
		greetingsInstance.sayHello("Hello world!");
    List<Integer> numberList = new ArrayList<Integer>();
    for(int number = 0; number < 10; number++)
          numberList.add(number);

    numberList.forEach(new Consumer<Integer>(){
        public void accept(Integer number){
          System.out.println(number + " ");
        }
    });


	}
}
