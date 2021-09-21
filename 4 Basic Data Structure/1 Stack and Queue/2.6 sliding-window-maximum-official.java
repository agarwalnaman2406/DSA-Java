import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // 1st Method
    
    int ngr[] = new int[n];
    Stack<Integer> sta = new Stack<> ();
    for(int i=n-1;i>=0;i--){
        while(sta.size()!=0 && a[i] > a[sta.peek()]){
            sta.pop();
        }
        
        if(sta.size() != 0){
            ngr[i] = sta.peek();
        }else{
            ngr[i] = n;
        }
        
        sta.push(i);
    }
    
    
    for(int i=0, j=0;i<=n-k;i++){
        if(i > j){
            j = i;
        }
        
        while(ngr[j] < i + k){
            j = ngr[j];
        }
        
        System.out.println(a[j]);
    }
    
    
    Deque<Integer> dq = new ArrayDeque<>();
    
    //2nd Method
    for(int i=0;i<a.length;i++){
        while(dq.size()!=0 && a[dq.getLast()] < a[i]){
            dq.removeLast();
        }
        dq.addLast(i);
        
        if(dq.peek() <= i-k){
            dq.removeFirst();
        }
        
        if(i >= k-1){
            System.out.println(a[dq.peek()]);
        }
    }
    
 }
}