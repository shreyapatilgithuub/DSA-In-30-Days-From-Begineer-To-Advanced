//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class FunctionsQuestion5 {

    // Function to print sum of odd numbers from 1 to n
    public static void printOddSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printOddSum(n); // function call

        sc.close();
    }
}
