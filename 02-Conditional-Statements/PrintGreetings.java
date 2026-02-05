//Conditional Statements: Switch
/*Write a program that asks to enter a button number (1, 2 or 3) and perform the following
i) if user enters 1, print "Hello!"
ii) if user enters 2, print "Namaste!"
iii) if user enters 3, print "Bonjour!"  */

import java.util.*;

public class PrintGreetings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any button number(1, 2 or 3): ");
        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("Hello!");
                break;
            case 2: System.out.println("Namaste!");
                break;
            case 3: System.out.println("Bonjour!");
                break;    
            default: System.out.println("Invalid button");
                break;
        }

        sc.close();

    }
}
