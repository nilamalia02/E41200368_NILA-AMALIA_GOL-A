package tugasM3;
/**
 *
 * @author Nila Amalia
 */
import java.util.Scanner;
public class sintaksSwitchCase {
    public static void main(String[] args) {
        String menumakanan;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("    CAFE CERIA");
        System.out.println("   ANEKA MINUMAN");
        System.out.println("---------------------");
        System.out.println("SPECIAL MENU :");
        System.out.println("1. Soft drinks");
        System.out.println("2. Mix juice");
        System.out.println("3. Nescafe");
        System.out.println("4. Soda milk");
        System.out.println("5. Tea");
        System.out.println("----------------------");
        System.out.print("Masukkan nama pembeli : ");
        String Masukkan = scan.nextLine();
        switch (Masukkan){
        }
        System.out.print("Silahkan masukkan pilihan anda : ");
        String Silahkan = scan.nextLine();
        
        switch (Silahkan) {
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Menu tidak ditemukan");
        }
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terimakasih " + Masukkan + " telah berkunjung di Cafe Ceria");
    }
    
}
