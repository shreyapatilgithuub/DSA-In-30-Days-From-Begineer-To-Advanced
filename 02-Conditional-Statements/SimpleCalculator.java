//Mini-Project - Simple Calculator Using Switch Statement

import java.util.*;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of a: ");
        int a = sc.nextInt();
        System.out.print("Select the Operator(+ , - , / , * or % ): ");
        char Operator = sc.next().charAt(0);
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        
        switch (Operator) {
            case '+': System.out.println(a + b);
                break;
            case '-': System.out.println(a - b);
                break;
            case '/': System.out.println(a / b);
                break;
            case '*': System.out.println(a * b);
                break;
            case '%': System.out.println(a % b); 
                break;           
            default: System.out.println("Invalid Entry");
                break;
        }

        sc.close();

    }
}
