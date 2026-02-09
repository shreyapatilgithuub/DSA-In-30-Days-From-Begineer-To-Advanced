//Write a function to calculate the product of 2 numbers.

import java.util.*;


public class FunctionsQuestion2 {
  
   public static int calculateProduct(int a, int b) {
      return a * b;
   }

       public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("a = ");
       int a = sc.nextInt();
       System.out.print("b = ");
       int b = sc.nextInt();
       System.out.print("Product = ");
       System.out.println(calculateProduct(a, b));

       sc.close();
   }
}
