
package assignments;
/*
Course : CPCS 202
Name : Shahad Alshehri
University ID : 
Section : DBR
Name of lab instructor : 
Problem number : 3
Assignment number : 2
Beecrowd id : 899919
*/
import java.util.Scanner;
import java.io.IOException;
public class ass2Q3 {
  public static void main(String[] args) throws IOException {
      Scanner input = new Scanner(System.in);
      int x = input.nextInt();
      double y = input.nextDouble();      
      switch (x){
          case 1 : System.out.printf("Total: R$ %.2f%n" , (y* 4.00)); break;
          case 2 : System.out.printf("Total: R$ " + "%.2f%n" , (y* 4.50)); break;
          case 3 : System.out.printf("Total: R$ %.2f%n" ,(y* 5.00)); break;
          case 4 : System.out.printf("Total: R$ %.2f%n" , (y* 2.00)); break;
          case 5 : System.out.printf("Total: R$ %.2f%n", (y* 1.50)); break;
      }
    }
 
}
