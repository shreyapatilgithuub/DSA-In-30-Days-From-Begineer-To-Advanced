//Patterns- Question 3
/*Print the pattern
*
**
***
****    */
public class Question3 {
   public static void main(String args[]) {
       int n = 4;

       for(int i=1; i<=n; i++) {

           for(int j=1; j<=i; j++) {
                   System.out.print("*");
           }
           System.out.println();
       }
   }
}