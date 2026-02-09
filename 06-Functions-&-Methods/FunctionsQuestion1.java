//Functions 
//Write a function to multiply 2 numbers.

import java.util.*;

public class FunctionsQuestion1 {

   //Multiply 2 numbers
   public static int multiply(int a, int b) {
       return a*b;
   }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("a = ");
       int a = sc.nextInt();
       System.out.print("b = ");
       int b = sc.nextInt();

       System.out.print("a * b = ");
       int result = multiply(a, b);
       System.out.println(result);

     sc.close();
    }

}
