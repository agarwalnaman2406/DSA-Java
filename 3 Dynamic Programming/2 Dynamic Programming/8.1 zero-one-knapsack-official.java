import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int val[] = new int[n];
        int wt[] = new int[n];
        
        for(int i=0;i<n;i++){
            val[i] = scan.nextInt();
        }
        
        for(int i=0;i<n;i++){
            wt[i] = scan.nextInt();
        }
        
        int cap = scan.nextInt(); 
        int ans = zerooneknapsackTab(val, wt, cap);
        System.out.println(ans);
    }
    
    public static int zerooneknapsackTab(int val[], int wt[], int cap){
        
        int dp[][] = new int[val.length + 1][cap+1];
        for(int i=0;i<=val.length;i++){
            for(int j=0;j<=cap;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }else{
                    if(j >= wt[i-1]){
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-wt[i-1]] + val[i-1]);
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        
        return dp[val.length][cap];
        
    }
    
}