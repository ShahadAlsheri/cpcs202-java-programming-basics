public class MainClass { 
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
