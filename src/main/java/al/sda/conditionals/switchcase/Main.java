package al.sda.conditionals.switchcase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter gender");
        String gender = scanner.nextLine();
        
        Person person = new Person(name, gender);
        
        String salutation = "";
        switch (person.gender) {
            case "M":
                salutation = "MR.";
                break;
            case"F":
                salutation = "MS.";
                break;
            case "U":
                salutation = "MX.";
                break;
            default:
                System.out.println("Unrecognized input for gender");
                return;
        }
        
        System.out.println("Hello " + salutation + person.name);
        
    }
    

}
