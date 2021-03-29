package latihanM4;
/**
 *
 * @author Nila Amalia
 */
public class for_each {
    public static void main(String[] args) {
        //membuat array
        int angka[] = {1,6,1,2,0,2};
        
        //menggunakan perulangan For each untuk menampilkan angka
        for( int x : angka ) {
            System.out.print(x + " ");
        }
    }
}
