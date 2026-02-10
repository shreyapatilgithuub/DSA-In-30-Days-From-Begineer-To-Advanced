//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class FunctionsQuestion6 {

    // Function to return the greater number
    public static int findGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    //Can also be written as: return (a > b) ? a : b;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int greater = findGreater(n1, n2); // function call
        System.out.println("Greater number is: " + greater);

        sc.close();
    }
}
