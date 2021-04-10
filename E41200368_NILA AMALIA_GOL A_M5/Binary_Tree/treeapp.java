/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Tree;

/**
 *
 * @author Nila Amalia
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class treeapp {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int value;
        String data;
        Tree tTree =new Tree();
        tTree.insert(50, "Nila");
        tTree.insert(25, "Amalia");
        tTree.insert(75, "Ijul");
        tTree.insert(12, "Diana");
        tTree.insert(37, "Adam");
        tTree.insert(43, "Taufik");
        tTree.insert(30, "Noga");
        tTree.insert(33, "Qori");
        tTree.insert(87, "Imami");
        tTree.insert(93, "Julianto");
        tTree.insert(97, "Mukti");
        
        while (true) {
            System.out.print("Enter first letter of show, " +
                "insert, find, delete, or traverse: ");
            int choice = getChar();
            switch (choice) {
                case 's':
                    tTree.displayTree();
                    break;
                    
                case 'i':
                    System.out.print("Enter value and data to" + " insert: ");
                    value = getInt();
                    data = getString();
                    tTree.insert(value, data);
                    break;
                    
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                   node found = tTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break;
                    
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = tTree.delete(value);
                    if (didDelete) {
                        System.out.println("Deleted " + value );
                    } else {
                        System.out.println("Could not delete " + value);
                    }
                    break;
                
                case 't':
                    System.out.print("Enter type 1, 2 or 3: ");
                    value = getInt();
                    tTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry ");
            }
        }
    }
    
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
