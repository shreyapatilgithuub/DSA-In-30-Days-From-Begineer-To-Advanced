//Take an array of names as input from the user and print them on the screen.

import java.util.*;


public class ArraysQuestion2 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array: ");
      int size = sc.nextInt();
      System.out.print("Enter the names: ");
      String names[] = new String[size];


      //input
      for(int i=0; i<size; i++) {
        sc.nextLine();
          names[i] = sc.nextLine();
      }
     
      //output
       for(int i=0; i<names.length; i++) {
           System.out.println("name " + (i+1) +" is : " + names[i]);
       }
      sc.close();
   }
}
