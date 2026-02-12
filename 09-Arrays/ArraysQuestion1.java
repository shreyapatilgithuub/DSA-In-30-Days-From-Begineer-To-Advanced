//Taking an array as an input and printing its elements.

import java.util.*;

public class ArraysQuestion1 {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the array size: ");
       int size = sc.nextInt();
       System.out.print("Enter the array: ");
       int numbers[] = new int[size];


       for(int i=0; i<size; i++) {
           numbers[i] = sc.nextInt();
       }

      //print the numbers in array
       for(int i=0; i<numbers.length; i++) {
           System.out.print(numbers[i]+" ");
       }

       sc.close();
   }
}
