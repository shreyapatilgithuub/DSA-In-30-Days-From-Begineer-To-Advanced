//Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.util.Scanner;

public class FunctionsQuestion10 {

    // Function to calculate GCD of two numbers
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = calculateGCD(num1, num2); // function call
        System.out.println("GCD = " + gcd);

        sc.close();
    }
}


/* Sample output:
Input: 12 18
Output: GCD = 6
*/