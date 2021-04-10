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
public class node {
    public int id;
    public String data;
    public node leftChild;
    public node rightChild;
    
    public void displayNode() {
        System.out.print("{ " + id + ", " + data + " }");
    }
}

