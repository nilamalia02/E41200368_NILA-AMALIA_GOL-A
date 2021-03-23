package tugasM3;
import java.util.Scanner;
/**
 *
 * @author Nila Amalia
 */
public class sintaksNila {
    public static void main(String[] args) {
        String belanja;
        int Total,Masukkan1,Masukkan2,Masukkan3,Masukkan4,Masukkan5;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----------------------------------------------------");
        System.out.println("            Kharisma Agung Plaza < KAP >");
        System.out.println("              Promo Belanja Brrhadiah");
        System.out.println("          Khusus Pembelian 5 Barang Pertama");
        System.out.println("          Dengan harga minimum Rp 10.000,00");
        System.out.println("----------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        String Masukkan = scan.nextLine();
        
        System.out.print("Masukkan harga barang ke-1 : ");
        Masukkan1 = scan.nextInt();
        System.out.print("Masukkan harga barang ke-2 : ");
        Masukkan2 = scan.nextInt();
        System.out.print("Masukkan harga barang ke-3 : ");
        Masukkan3 = scan.nextInt();
        System.out.print("Masukkan harga barang ke-4 : ");
        Masukkan4 = scan.nextInt();
        System.out.print("Masukkan harga barang ke-5 : ");
        Masukkan5 = scan.nextInt();
        Total = Masukkan1+Masukkan2+Masukkan3+Masukkan4+Masukkan5;
        System.out.println("Total harga pembelian atas nama "+ Masukkan +" adalah Rp "+ Total);
        
        System.out.println("Sealamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        System.out.println("----------------------------------------------------");
        System.out.println("                    Terima Kasih");
        System.out.println("       Anda sudah belanja di Kharisma Agung Plaza"); 
    }
}
