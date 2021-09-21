import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        // Tabulizaton Approach
        int sumlastinc = arr[0];
        int sumlastexc = 0;
        
        for(int i=1;i<n;i++){
            int newlastinc = sumlastexc + arr[i];
            int newlastexc = Math.max(sumlastinc, sumlastexc);
            sumlastinc = newlastinc;
            sumlastexc = newlastexc;
        }
        
        //System.out.println(Math.max(sumlastinc, sumlastexc));
        
        int dp[] = new int[n];
        int ans = maxSum(arr, 0, dp);
        System.out.println(ans);
    }
    
    public static int maxSum(int arr[], int idx, int dp[]){
        
        if(idx >= arr.length){
            return 0;
        }
        
        if(dp[idx] != 0){
            return dp[idx];
        }
        
        int f1 = 0 + maxSum(arr, idx+1, dp);
        int f2 = arr[idx] + maxSum(arr, idx+2, dp);
        int ans = Math.max(f1, f2);
        dp[idx] = ans;
        return ans;
        
    }
}