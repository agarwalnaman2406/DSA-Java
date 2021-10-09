import java.io.*;
import java.util.*;

public class Main {
   static class Edge{
       int src;
       int nbr;
       public Edge(int src, int nbr){
           this.src = src;
           this.nbr = nbr;
       }
   }

   public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);

      int n = scan.nextInt();
      int k = scan.nextInt();
      
      // write your code here
      ArrayList<Edge>[] graph = new ArrayList[n];
      for(int i=0;i<n;i++){
          graph[i] = new ArrayList<>();
      }
      
      
      for(int i=0;i<k;i++){
          int a = scan.nextInt();
          int b = scan.nextInt();
          graph[a].add(new Edge(a , b));
          graph[b].add(new Edge(b , a));
      }
      
      ArrayList<ArrayList<Integer>> comps = new ArrayList<ArrayList<Integer>>();
      boolean visited[] = new boolean[n];
      for(int i=0;i<n;i++){
          if(!visited[i]){
              ArrayList<Integer> comp = new ArrayList<>();
              gcc(graph, i, visited, comp);
              comps.add(comp);
          }
      }
      
      int ans = 0;
      
      for(int i=0;i<comps.size();i++){
          for(int j=i+1;j<comps.size();j++){
              ans += comps.get(i).size() * comps.get(j).size();
          }
      }
      
      System.out.println(ans);
      
   }
   
   public static void gcc(ArrayList<Edge>[] graph, int src, boolean visited[], ArrayList<Integer> comp){
       
       visited[src] = true;
       comp.add(src);
       
       for(Edge e: graph[src]){
           if(!visited[e.nbr]){
               gcc(graph, e.nbr, visited, comp);
           }
       }
   }

}