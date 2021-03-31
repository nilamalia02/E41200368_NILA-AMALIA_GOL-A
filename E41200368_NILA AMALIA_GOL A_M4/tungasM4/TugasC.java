package tungasM4;
/**
 *
 * @author Nila Amalia
 */
import java.util.Scanner;
public class TugasC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       System.out.print("Masukkan banyaknya data nilai = ");
        int nilai = scan.nextInt();
        int [] data = new int[nilai];
        for(int i =0; i<nilai;i++){
            int n = i+1;
            System.out.print("Maukkan data nilai ke-"+n+" = " );
            data[i]=scan.nextInt();
        }
        scan.close();
       
        
        int array[];
        array = data;
        float jumlah = 0;
        int minimum = array[0];
        int maksimum = array[0];
        
        for(int j =0 ; j<=3; j++){
            if (array[j] < minimum ) minimum = array[j];
            if (array[j] > maksimum ) maksimum = array[j];   
            }
        for(int k =0 ;k < array.length; k++){
            jumlah =  jumlah + array[k];
            
        }
        
        float rata2;
        rata2 = jumlah / array.length;
            
            
            
            System.out.println("Nilai minimum  = " +minimum);
            System.out.println("Nilai maksimum = " +maksimum);
            System.out.println("Nilai rata ratanya adalah = "+rata2);
    
    }
}


