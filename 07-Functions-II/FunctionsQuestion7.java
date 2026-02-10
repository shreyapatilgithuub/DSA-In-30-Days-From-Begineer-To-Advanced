//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class FunctionsQuestion7 {

    // Function to calculate and return circumference
    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();

        double circumference = getCircumference(r); // function call
        System.out.println("Circumference of the circle = " + circumference);

        sc.close();
    }
}
