//Day 2 
//Take two input variables 'a' & 'b' and print their sum
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of a: ");
    int a = sc.nextInt();
    
    System.out.print("Enter the value of b: ");
    int b = sc.nextInt();
    
    System.out.print("The sum of a & b is: ");
    int sum = a + b;
    System.out.println(sum);

    sc.close();
    }
}