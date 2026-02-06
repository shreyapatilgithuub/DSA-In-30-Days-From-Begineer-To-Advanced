//Loops
//Print Table of the number input by the user

import java.util.*;

public class PrintTable {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a natural number: ");
    int n = sc.nextInt();
    
    int mul = 0;

    for(int i = 1; i <= 10; i++){
        mul = n * i;
    System.out.print(mul + " ");
    }
    
    sc.close();

    }
}
