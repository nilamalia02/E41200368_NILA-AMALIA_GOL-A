package latihanM3;
/**
 *
 * @author Nila Amalia
 */
import java.util.Scanner;
public class CS2 {
    public static void main(String[] args) {
        String pelangi;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan jenis warna: ");
        pelangi = scan.nextLine();
        switch (pelangi) {
            case "merah":
                System.out.println("Warna no.1, paling atas");
                break;
            case "jingga":
                System.out.println("Warna no.2, setelah warna merah");
                break;
            case "kuning":
                System.out.println("warna no.3, setelah warna jingga");
                break;
            case "hijau":
                System.out.println("warna no.4, setelah warna kuning");
                break;
            case "biru":
                System.out.println("warna no.5, setelah warna hijau");
                break;
            case "nila":
                System.out.println("nama sya :)");
                break;
            case "ungu":
                System.out.println("warna no.7, warna terakhir setelah warna nila");
                break;
            default:
                System.out.println("warana tidak ditemukan, coba salah satu dari 'MeJiKuHiBiNiU'!");
        }
    }
}
