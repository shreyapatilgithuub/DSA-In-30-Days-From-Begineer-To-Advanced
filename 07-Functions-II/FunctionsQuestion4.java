//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class FunctionsQuestion4 {

    // Function to calculate and print average
    public static void printAverage(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("Average = " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        // Calling the function
        printAverage(n1, n2, n3);

        sc.close();
    }
}
