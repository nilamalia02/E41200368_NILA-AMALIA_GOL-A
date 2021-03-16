/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Nila Amalia
 */
class book {
        int price;
        int pages;
        
        public void set (int price, int pages) {
            this.price = price;
            this.pages = pages;
        }
        public void show () {
            System.out.println("books informations");
            System.out.println("books price : " +price);
            System.out.println("number of pages : " +pages);
        }
    }
        public class c {
            public static void main(String[] args) {
                book javabook = new book();
                javabook.set(60000, 100);
                javabook.show();
            } 
}