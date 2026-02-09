//Write a function to calculate the factorial of a number.

import java.util.*;

public class FunctionsQuestion3 {

    // Function to calculate factorial
    public static int calculateFactorial(int n) {

        if (n < 0) {
            return -1; // Invalid number
        }

        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = calculateFactorial(n);

        if (result == -1) {
            System.out.println("Invalid Number");
        } else {
            System.out.println("Factorial = " + result);
        }

        sc.close();
    }
}

