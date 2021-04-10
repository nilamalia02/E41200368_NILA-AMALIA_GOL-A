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
public class graphapp {
    public static void main(String[] args) {
      graph tGraph = new graph();
      tGraph.addVertex('A');// 0  (start for bfs)
      tGraph.addVertex('B');// 1
      tGraph.addVertex('C');// 2
      tGraph.addVertex('D');// 3
      tGraph.addVertex('E');// 4

      tGraph.addEdge(0, 1);// AB
      tGraph.addEdge(1, 2);// BC
      tGraph.addEdge(0, 3);// AD
      tGraph.addEdge(3, 4);// DE

      tGraph.bfs();
      System.out.println();     
      System.out.println();
      
      tGraph.dfs();
      System.out.println();      
      System.out.println();
      
      tGraph.display();
    }
}
