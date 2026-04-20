import java.io.IOException;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x == 0){
            if (y==0)
                System.out.print("Origem");
            else if ( y > 0 || y < 0)
                System.out.print("Eixo Y");
        }
        else if (x > 0 ){
            if (y == 0)
                System.out.print("Eixo X");
            else if (y > 0 )
                System.out.print("Q1");
            else if (y < 0)
                System.out.print("Q4");
        }
        else if (x < 0){
            if (y == 0 )
                System.out.print("Eixo X");
            else if (y > 0 )
                System.out.print("Q2");
            else if (y < 0)
                System.out.print("Q3");
        }
        System.out.println();
        
    }
 
}
