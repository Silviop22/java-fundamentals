package al.sda.operators;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean turnOff = false;
        String command;
        
        while (turnOff == false) {
            System.out.println("Enter first operand");
            int a = scanner.nextInt();
            System.out.println("Enter second operand");
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
