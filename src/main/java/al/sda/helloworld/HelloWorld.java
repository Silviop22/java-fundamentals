package al.sda.helloworld;

public class HelloWorld {
    public static final String staticValue = "TEST";
    public final String lastName = "";
    public String name;
    public int age;
    public String getMessage() {
        return "Hello " + name;
    }
    
    public static String getDefaultMessage() {
        return "Hello World";
    }
}
