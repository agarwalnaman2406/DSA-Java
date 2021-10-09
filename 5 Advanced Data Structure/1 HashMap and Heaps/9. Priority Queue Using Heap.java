import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }
    
    public void upheapify(int ci){
        
        if(ci == 0){
            return;
        }
        
        int pi = (ci - 1) / 2;
        if(data.get(pi) > data.get(ci)){
            int temp = data.get(pi);
            data.set(pi, data.get(ci));
            data.set(ci, temp);
            upheapify(pi);
        }
    }

    public void add(int val) {
      // write your code here
      data.add(val);
      upheapify(data.size()-1);
    }
    
    public void downheapify(int pi){
        int lci = 2*pi + 1;
        int rci = 2*pi + 2;
        
        int minidx = pi;
        if(lci < data.size() && data.get(lci) < data.get(minidx)){
            minidx = lci;
        }
        
        if(rci < data.size() && data.get(rci) < data.get(minidx)){
            minidx = rci;
        }
        
        if(minidx != pi){
            int temp = data.get(pi);
            data.set(pi, data.get(minidx));
            data.set(minidx, temp);
            downheapify(minidx);
        }
    }

    public int remove() {
      // write your code here
      if(data.size()==0){
          System.out.println("Underflow");
          return -1;
      }
      
      int temp = data.get(0);
      data.set(0, data.get(data.size()-1));
      data.set(data.size()-1, temp);
      int ans = data.remove(data.size()-1);
      downheapify(0);
      
      return ans;
    }

    public int peek() {
      // write your code here
      if(data.size()==0){
          System.out.println("Underflow");
          return -1;
      }
      return data.get(0);
    }

    public int size() {
      // write your code here
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}