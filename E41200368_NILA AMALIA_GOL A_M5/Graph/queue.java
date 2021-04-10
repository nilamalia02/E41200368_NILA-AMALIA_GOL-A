/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author Nila Amalia
 */
public class queue {
    private final int SIZE = 20;
    private int[] queArray;
    private int front;
    private int rear;

    public queue() {
        queArray = new int[SIZE];
        front = 0;
        rear = -1;
        }
    public void insert(int j){
        if(rear == SIZE-1)
            rear = -1;
        queArray[++rear] = j;
        }
    public int remove(){
        int temp = queArray[front++];
        if(front == SIZE)
            front = 0;
        return temp;
        }
    public boolean isEmpty() {
        return ( rear+1==front || (front+SIZE-1==rear) );
        }
}
