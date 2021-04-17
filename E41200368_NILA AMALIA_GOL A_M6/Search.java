/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_m6_nila;

/**
 *
 * @author Nila Amalia
 */

public class Search {
    public static void main(String[] args) {
        int[] ex = {1, 2, 16, 20, 12, 18, 19};
        int target = 19;
        sequentialSearch(ex, target);
    }
    public static void sequentialSearch(int[] parameter1, int parameter2) {
        int index = -1;
        //menelusuri indeks padsa array hingga indeks terakhir
        for (int i = 0; i < parameter1.length; i++) {
            if (parameter1[i] == parameter2) {
                //jika target ditemukan maka index int ditetapkan sebagai nilai i
                index = i;
                //maka perulangan for diakhiri
                break;
            }
        }
        if (index == -1) {
            System.out.println("integer target tidak ditemukan pada array");
        } else {
            System.out.println("integer target anda ada dalam index " +index+ " pada array");
        }
            
    }

}
