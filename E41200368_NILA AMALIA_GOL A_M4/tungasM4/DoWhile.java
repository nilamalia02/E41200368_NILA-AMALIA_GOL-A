package tungasM4;
/**
 *
 * @author Nila Amalia
 */
public class DoWhile {
    public static void main(String[] args) {
       
        System.out.println("        Do_while");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int i = 1;
        do {
            System.out.print(i + " ");
            i *= 2;
        } 
        while ( i < 100);
    }
}
