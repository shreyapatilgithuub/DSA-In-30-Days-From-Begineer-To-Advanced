//Conditional Statements: Else-If 
/* write a program that takes two integers inputs a and b from user and print:
 "a is equal to b" if they are same,
 "a is greater than b" if a > b,
 "a is less than b" if a < b. */

import java.util.*;

public class CompareNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } 
        else {
            System.out.println("a is less than b");
        }

         sc.close();

        }

    }
    

