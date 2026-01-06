package assignments;
/*
Course : CPCS 202
Name : Shahad Alshehri
University ID : 
Section : DBR
Name of lab instructor : 
Problem number : 1
Assignment number : 3
Beecrowd id : 899919
*/
public class ass3Q1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <10){
            int j;
            for ( j = (i+6) ; j > (i+3); j--){
                System.out.println("I=" + i + " J=" + j);
            }
            i+=2;
        }
    }
    
}
