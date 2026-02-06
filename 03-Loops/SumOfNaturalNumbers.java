//Loops
//Print the sum of first n Natural numbers.

import java.util.*;
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i <= n; i++){
        sum = sum + i;
        }
        System.out.println(sum);

        sc.close();

    }
}
