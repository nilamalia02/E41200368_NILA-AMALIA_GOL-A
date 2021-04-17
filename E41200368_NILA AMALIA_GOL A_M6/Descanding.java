/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_m6_nila;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Nila Amalia
 */
public class Descanding {
     public static void main(String[] args) {
        
        int data,n = 0;
        int x, y, temp;
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Input banyaknya jumlah data : ");
        try{
            n=input.nextInt();
        }
        catch(Exception e){
            System.out.println("Data harus berupa angka!");
        }
        int angka[] = new int[n];
        int angka_desc[] = new int[n];
        for(x=0;x<n;x++){
            System.out.print("Masukkan data ke - " + (x+1) + " : ");
            try{
                data = input.nextInt();
                angka[x] = data;
                angka_desc[x] = data;
            }
            catch(Exception e){
                System.out.println("Data harus berupa angka!");
            }
        }
        for(x = 0; x < n - 1; x++){
            for(y = x + 1; y < n; y++){
                if(angka_desc[x]< angka_desc[y]){
                    temp = angka_desc[x];
                    angka_desc[x] = angka_desc[y];
                    angka_desc[y] = temp;
                }
            }
        }
        System.out.print("Data sebelum diurutkan : ");
        for(x = 0; x < n; x++){
            System.out.print(angka[x] + ", ");
        }
        System.out.print("Data setelah diurutkan Descending : ");
        for(x = 0;x < n; x++){
            System.out.print(angka_desc[x] + ", ");
        }
        System.out.println("");

    }
}
