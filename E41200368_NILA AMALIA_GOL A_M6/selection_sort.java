/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_m6_nila;
import java.util.Scanner;
/**
 *
 * @author Nila Amalia
 */
public class selection_sort {
    public static void main(String[] args)
    {
        //    membuat objek scanner
        Scanner scan = new Scanner(System.in);
         
        //    Input jumlah data
        System.out.print("Masukkan jumlah Data : ");    int jmlhdt = scan.nextInt();
         
        //    Input nilai setiap data
        int[] data = new int[jmlhdt]; //    Array untuk nilai setiap data
        System.out.println();
        for(int n = 0; n < jmlhdt ; n++)
        {
            System.out.print("Input nilai data ke-"+(n + 1) +" : ");
            data[n] = scan.nextInt();
        }
         
        //    Tampilan data sebelum sorting
        System.out.println();
        System.out.print("Data Sebelum di Sorting : ");
        for(int n = 0; n < jmlhdt ; n++)
            System.out.print(data[n] + " ");
         
        //    Proses selection sort
        System.out.println("\n\nProses Selection Sort");
        for(int n = 0; n < jmlhdt - 1; n++)
        {
            System.out.println("Iterasi ke-"+ (n + 1) +" : ");
            for(int m = 0; m < jmlhdt; m++)
                System.out.print(data[m] +" ");
             
            System.out.println("Apakah data "+ data[n] +" sudah benar pada urutannya?");
             
            boolean tukar = false;
            int index = 0;
            int min = data[n];
            String informasi = "   Tidak ada pertukaran";
            for(int m = n + 1; m < jmlhdt; m++)
            {
                if(min > data[m])
                {
                    tukar = true;
                    index = m;
                    min = data[m];
                     
                }
            }
             
            if(tukar == true)
            {
                //Pertukaran data
                informasi = "Data "+ data[n] +" ditukar dengan Data "+ data[index];
                int temp = data[n];
                data[n] = data[index];
                data[index] = temp;
            }
             
            for(int m = 0; m < jmlhdt; m++)
                System.out.print(data[m]+" ");
             
            System.out.println(informasi+" ");
        }
         
        //Tampilan data setelah di sorting
        System.out.print("Data setelah di sorting : ");
        for(int n = 0; n < jmlhdt; n++)
            System.out.print(data[n]+" ");
    }
}
