public class Main{

    @FunctionalInterface
    interface Greetings {
        public void sayHello(String name);
    }


    public static void main(String[] args) {
		Greetings greetingsInstance = str -> System.out.println(str);
		greetingsInstance.sayHello("Hello world!");
	}
}