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
public class bobble_sort {

        static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n - i); j++) {
                if(arr[j-1] > arr[j]) {
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {16, 12, 20, 0, 2, 18, 19};
                System.out.println("Array Sebelum Bubble Sort");
                for(int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                    System.out.println();
                    bubbleSort(arr); //sorting elemen array menggunakan bubble sort
                    System.out.println("Array Setelah Bubble Sort");
                    for(int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
    }
}
