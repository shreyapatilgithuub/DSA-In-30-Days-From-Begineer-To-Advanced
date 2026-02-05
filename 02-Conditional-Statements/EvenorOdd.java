//Conditional Statements: If-Else
//Take an input 'a' from user and check whether 'a' is Even or Odd.

import java.util.*;

public class EvenorOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("a is Even");
        } else {
            System.out.println("a is Odd");
        }

        sc.close();

    }
}
