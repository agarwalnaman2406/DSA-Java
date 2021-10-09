import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
   static class Pair{
       int src;
       int level;
       Pair(int src, int level){
           this.src = src;
           this.level = level;
       }
   }
   
   public static boolean isGraphBipartite(ArrayList<Edge>[] graph, int visited[], int src){
       
       Queue<Pair> qu = new ArrayDeque<>();
       qu.add(new Pair(src, 0));
       while(qu.size()>0){
           
           Pair rem = qu.remove();
           
           if(visited[rem.src]!=-1){
               if(visited[rem.src] != rem.level){
                   return false;
               }
           }
           
           visited[rem.src] = rem.level;
           for(Edge e:graph[src]){
               if(visited[e.nbr] == -1){
                   qu.add(new Pair(e.nbr, rem.level+1));
               }
           }
           
       }
       
       return true;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      // write your code here
      int visited[] = new int[vtces];
      for(int i=0;i<vtces;i++){
          visited[i] = -1;
      }
      
      for(int i=0;i<vtces;i++){
          if(visited[i] == -1){
              boolean ans = isGraphBipartite(graph, visited, i);
              if(ans == false){
                  System.out.println(false);
                  return;
              }
          }
      }
      System.out.println(true);
   }
}