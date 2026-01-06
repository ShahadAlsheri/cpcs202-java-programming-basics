package assignments;
import java.util.*;
/*
Course : CPCS 202
Name : Shahad Alshehri
University ID : 
Section : DBR
Name of lab instructor : 
Problem number : 3
Assignment number : 3
Beecrowd id : 899919
*/
public class ass3Q3 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a =0, g = 0, d = 0;
        int i = 0;
        do{
            i = input.nextInt();
            if (i == 1) a++;
            else if (i == 2 ) g++;
            else if (i == 3 ) d++;
   }while (i != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);
    }
    
}
