package assignments;
import java.util.*;
/*
Course : CPCS 202
Name : Shahad Alshehri
University ID : 
Section : DBR
Name of lab instructor :
Problem number : 4
Assignment number : 3
Beecrowd id : 899919
*/
public class ass3Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        int total = 0, c=0, r=0, s =0;
        for( int x = 1 ; x <= times; x++){
            int num = input.nextInt();
            char litter = input.next().charAt(0);
            total+= num;
            if (litter == 'C') {
                c+=num;
            }
            else if(litter == 'R') {
                r+=num;
            }
            else if(litter == 'S') {
                s+=num;
            }
        }
        float C= ConvertFloat (total, c);
        float R= ConvertFloat (total, r);
        float S= ConvertFloat (total, s);
         

        System.out.println("Total: "+ total +" cobaias");
        System.out.println("Total de coelhos: "+ c);
        System.out.println("Total de ratos: "+r);
        System.out.println("Total de sapos: "+s);
        System.out.printf("Percentual de coelhos: %.2f", C ); System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", R); System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", S ); System.out.println(" %");
         
    }
public static float ConvertFloat(int total, int total_T){
 float S = (float) ((float)total_T/total*100.0 );
 return S;
}
}