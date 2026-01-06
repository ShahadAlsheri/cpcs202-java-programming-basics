
package assignments;
/*
Course : CPCS 202
Name :
University ID :
Section :
Name of lab instructor :
Problem number :
Assignment number :
Beecrowd id :
*/
import java.util.Scanner;
import java.io.IOException;
public class ass2Q2 {
    public static void main(String[] args) throws IOException {
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();
       int c = input.nextInt();
       if (c < a && c < b) {
           System.out.println(c);
           if (a > b ) {
               System.out.println(b);
               System.out.println(a);
           }
           else if (a < b ) {
               System.out.println(a);
               System.out.println(b);
           }
       }
       if (b <a && b < c) {
           System.out.println(b);
           if (c > a ) {
               System.out.println(a);
               System.out.println(c);
           }
           else if (c < a ) {
               System.out.println(c);
               System.out.println(a);
           }
       }
       if (a < b && a < c){
           System.out.println(a);
           if (b> c){
               System.out.println(c);
               System.out.println(b);
           }
           if (b< c){
               System.out.println(b);
               System.out.println(c);
           }
       }
       System.out.println();
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println();
    }
 
}