import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   
   static class Pair{
       
       int src;
       int time;
       Pair(int src, int time){
           this.src = src;
           this.time = time;
       }
       
   }
   
   public static int infectionSpread(ArrayList<Edge>[] graph, int src, int t, boolean visited[]){
       
       Queue<Pair> queue = new ArrayDeque<Pair>();
       queue.add(new Pair(src, 1));
       int count = 0;
       while(queue.size() > 0){
           
           Pair rem = queue.remove();
           if(visited[rem.src]==true){
               continue;
           }
           
           if(t < rem.time){
               break;
           }
           count++;
           visited[rem.src] = true;
           for(Edge e:graph[rem.src]){
               if(!visited[e.nbr]){
                   queue.add(new Pair(e.nbr, rem.time+1));
               }
           }
       }
       
       return count;
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      // write your code here
      boolean visited[] = new boolean[vtces];
      int ans = infectionSpread(graph, src, t, visited);
      System.out.println(ans);
   }

}