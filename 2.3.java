public class MainClass {
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
