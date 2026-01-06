
package assignments;
import java.util.Scanner;
/*
Course : CPCS 202
Name : Shahad Alshehri
University ID : 
Section : DBR
Name of lab instructor : 
Problem number : 2
Assignment number : 3
Beecrowd id : 899919
*/
public class ass3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();                
        int x = getPosition (a);
    }
    public static int getPosition(String letter){
        char f =  letter.charAt(0);
        int s =0 ;
        if (f >= 'A' && f<= 'Z'){
             s = f-64;
            System.out.println(s);
        }
        return s;
    }
}