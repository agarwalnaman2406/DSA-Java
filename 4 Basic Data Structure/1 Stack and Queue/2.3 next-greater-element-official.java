import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "
");
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

    int[] nge = solve2(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
   int ans[] = new int[arr.length];
   int n = arr.length - 1;
   Stack<Integer> st = new Stack<> ();
   
   // Right To Left
   while(n >= 0){
        
        while(st.size() != 0 && st.peek() <= arr[n]){
            st.pop();
        }
        
        if(st.size() != 0){
            ans[n] = st.peek();
        }else{
            ans[n] = -1;
        }
        st.push(arr[n]);
        n--;
   }
   
   return ans;
 }

public static int[] solve2(int[] arr){
    // Left To Right
    int ans[] = new int[arr.length];
    Stack<Integer> st = new Stack<> ();
    
    st.push(0);
    for(int i=1;i<arr.length;i++){
        while(st.size() != 0 && arr[st.peek()] < arr[i]){
            ans[st.pop()] = arr[i];
        }
        st.push(i);
    } 
    
    while(st.size() != 0){
        ans[st.pop()] = -1;
    }
    
    return ans;
}

}