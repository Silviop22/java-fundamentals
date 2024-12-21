package al.sda.helloworld;


public class Main {
    
    public static void main(String[] args) {
        doSomething();
    }
    
    public static void doSomething() {
        System.out.println(HelloWorld.getDefaultMessage());
        HelloWorld printer;
        printer = new HelloWorld();
        printer.name = "Silvio";
        thenDoThis();
        System.out.println(printer.getMessage());
        
    }
    
    public static void thenDoThis() {
        System.out.println("Another operation");
    }
}
