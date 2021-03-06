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
   
   static class Pair implements Comparable<Pair>{
       int src;
       int parent;
       int wt;
       Pair(int src, int parent, int wt){
           this.src = src;
           this.parent = parent;
           this.wt = wt;
       }
       
       public int compareTo(Pair o){
           return this.wt - o.wt;
       }
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
      boolean visited[] = new boolean[vtces];
      minwire(graph, 0, visited);
   }
   
   public static void minwire(ArrayList<Edge>[] graph, int src, boolean visited[]){
       
       PriorityQueue<Pair> pq = new PriorityQueue<>();
       pq.add(new Pair(src, -1, 0));
       while(pq.size()!=0){
           
           Pair re = pq.remove();
           
           if(visited[re.src] == true){
               continue;
           }
           
           if(re.parent != -1){
               System.out.println("["+re.src + "-" + re.parent+"@"+re.wt+"]");
           }
           
           visited[re.src] = true;
           for(Edge e:graph[re.src]){
               if(!visited[e.nbr]){
                   pq.add(new Pair(e.nbr, re.src, e.wt));
               }
           }
            
       }
       
   }

}