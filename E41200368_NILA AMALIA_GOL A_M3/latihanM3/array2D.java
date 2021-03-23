package latihanM3;
/**
 *
 * @author Nila Amalia
 */
public class array2D {
    public static void main(String[] args) {
        int [][] angka = {{1,6,1,2},{2,0,0,2},{1,8,20,20}};
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                System.out.print(angka[baris][kolom]+"   ");
            }
            System.out.println("");
        }
    }
}
