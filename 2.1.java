public class MainCLass {
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
