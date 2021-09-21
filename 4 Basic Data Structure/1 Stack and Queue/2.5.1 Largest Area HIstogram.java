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
    
    int nsr[] = new int[n]; // Next Smallest Elements In Right
    int nsl[] = new int[n]; // Next Smallest Elements In Left
    Stack<Integer> str = new Stack<> ();
    for(int i=n-1;i>=0;i--){
        while(str.size() != 0 && a[i] <= a[str.peek()]){
            str.pop();
        }
        if(str.size() !=0){
            nsr[i] = str.peek();
        }else{
            nsr[i] = n;
        }
        str.push(i);
    }
    
    Stack<Integer> stl = new Stack<> ();
    for(int i=0;i<n;i++){
        while(stl.size() != 0 && a[i] <= a[stl.peek()]){
            stl.pop();
        }
        if(stl.size() != 0){
            nsl[i] = stl.peek();
        }else{
            nsl[i] = -1;
        }
        stl.push(i);
    }
    
    int ans = 0;
    for(int i=0;i<n;i++){
        int temp = a[i] * (nsr[i] - nsl[i] - 1);
        ans = Math.max(temp, ans);
    }
    
    System.out.println(ans);
 }
}