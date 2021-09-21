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

    // code
    
    int nsr[] = new int[n];
    int nsl[] = new int[n];
    
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<n;i++){
        
        while(st.size()!=0 && a[st.peek()] > a[i]){
            nsr[st.pop()] = i;
        }
        
        st.push(i);
        
    }
    
    while(st.size()!=0){
        nsr[st.pop()] = n;
    }
    
    for(int i=n-1;i>=0;i--){
        while(st.size()!=0 && a[st.peek()] > a[i]){
            nsl[st.pop()] = i;
        }
        
        st.push(i);
    }
    
    while(st.size()!=0){
        nsl[st.pop()] = -1;
    }
    
    
    
    int ans = 0;
    for(int i=0;i<n;i++){
        int width = nsr[i] - nsl[i] - 1;
        int area = width * a[i];
        ans = Math.max(ans, area);
    }
    
    System.out.println(ans);
    
 }
}