//Loops
//Print all Even numbers till n.

import java.util.*;

public class PrintEvenNumbers {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();
    
    for(int i =0 ; i <= n; i++){
        if (i % 2 == 0) {
            System.out.print(i + " ");
        }
    }
    sc.close();
}
}
