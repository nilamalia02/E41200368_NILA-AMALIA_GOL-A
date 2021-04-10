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
public class graph {
    private final int MAX_VERTS = 20;
    private vertex vertexList[]; 
    private int adjMat[][];      
    private int nVerts;  
    //BFS
    private queue theQueue;
    //DFS
    private stackx theStack;
   
    public graph() {
       vertexList = new vertex[MAX_VERTS];
       adjMat = new int[MAX_VERTS][MAX_VERTS];
       nVerts = 0;

       for(int j = 0; j < MAX_VERTS; j++)      
          for(int k = 0; k < MAX_VERTS; k++)   
             adjMat[j][k] = 0;

       theQueue = new queue();  //bfs
       theStack = new stackx(); //dfs
    }  

    public void addVertex(char lab) {
        vertexList[nVerts++] = new vertex(lab);
    }
    public void addEdge(int start, int end) {
       adjMat[start][end] = 1;
       adjMat[end][start] = 1;
       }
    public void displayVertex(int v) {
       System.out.print(vertexList[v].label + " ");
    }
    
    //implementasi bfs
    public void bfs() {
       System.out.println("Visit using BFS Algorithm: ");
       vertexList[0].wasVisited = true; 
       displayVertex(0);
       theQueue.insert(0);
       
       int v2;

       while( !theQueue.isEmpty() ) {
          int v1 = theQueue.remove();   

          while( (v2=getAdjUnvisitedVertex(v1)) != -1 ) {                                  
             vertexList[v2].wasVisited = true;  
             displayVertex(v2);                 
             theQueue.insert(v2);               
            }   
        }  

       for(int j=0; j<nVerts; j++)             // reset flags
          vertexList[j].wasVisited = false;
       }  

    //implementasi dfs
    public void dfs() { 
        System.out.println("Visit using DFS Algorithm: ");
        vertexList[0].wasVisited = true;  
        displayVertex(0);   
        theStack.push(0); 

        while (!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;  
                displayVertex(v);  
                theStack.push(v);
            }
        }  


        for (int j = 0; j < nVerts; j++) { // reset flags
            vertexList[j].wasVisited = false;
        }
    }  

    public int getAdjUnvisitedVertex(int v) {
       for(int j = 0; j < nVerts; j++)          
           if(adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
               return j;
       return -1;
       }  

    public void display() {
         System.out.println("Adjecency: ");
         for (int row = 0; row < nVerts; row++) {
             for (int col = 0; col < row; col++) {
                 if ( adjMat[row][col] == 1) {
                     System.out.println(
                             vertexList[row].label + " -- " + vertexList[col].label);
                 }
             }
         }
         System.out.println("");
    }
}
