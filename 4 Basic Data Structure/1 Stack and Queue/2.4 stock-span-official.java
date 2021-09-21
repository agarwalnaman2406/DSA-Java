import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   // solve
   int n = arr.length;
   int ans[] = new int[n];
   Stack<Integer> sta = new Stack<> ();
   for(int i=0;i<n;i++){
       while(sta.size() != 0 && arr[i] >= arr[sta.peek()]){
           sta.pop();
       }
       
       if(sta.size() == 0){
           ans[i] = i+1;
       }else{
           ans[i] = i - sta.peek();
       }
       
       sta.push(i);
   }
   return ans;
 }

}