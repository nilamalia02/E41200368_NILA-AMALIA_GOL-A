package latihanM3;
/**
 *
 * @author Nila Amalia
 */
public class array1D {
    public static void main(String[] args) {
        int[] angka = {16, 12, 20, 0, 2};
        String[] teks = {"hai","nama","saya","Nila","Amalia"};
        
        for(int i=0; i<angka.length; i++) {
            System.out.println(angka[i]);
    }
        for(int j=0; j<teks.length; j++) {
            System.out.print(teks[j]);
            System.out.print(" ");
        }
    }
}
