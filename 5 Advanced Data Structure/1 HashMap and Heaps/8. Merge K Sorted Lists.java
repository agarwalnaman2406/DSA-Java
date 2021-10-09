import java.io.*;
import java.util.*;

public class Main {
   
   public static class Pair implements Comparable<Pair>{
       int val;
       int li;
       int di;
       
       public Pair(int val, int li, int di){
           this.val = val;
           this.li = li;
           this.di = di;
       }
       
       public int compareTo(Pair o){
           return this.val - o.val;
       }
       
   }
    
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();
      PriorityQueue<Pair> pq = new PriorityQueue<>();
      // write your code here
      
      for(int i=0;i<lists.size();i++){
          ArrayList<Integer> list = lists.get(i);
          pq.add(new Pair(list.get(0),i,0));
      }
      
      while(pq.size()!=0){
          Pair p = pq.remove();
          rv.add(p.val);
          p.di++;
          if(p.di<lists.get(p.li).size()){
              p.val = lists.get(p.li).get(p.di);
              pq.add(p);
          }
      }
      

      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}