import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        int dp[] = new int[n+1];
        System.out.println(cs(0, n, dp, arr));
    }
    
    public static int cs(int i, int n, int dp[], int arr[]){
        if(i > n){
            return 0;
        }
        
        if(i == n){
            return 1;
        }
        
        if(dp[n] != 0){
            return dp[n];
        }
        
        int ans = 0;
        for(int jumps=1;jumps<=arr[i];jumps++){
            ans += cs(i+jumps, n, dp, arr);
        }
        
        dp[i] = ans;
        return ans;
        
    }

}