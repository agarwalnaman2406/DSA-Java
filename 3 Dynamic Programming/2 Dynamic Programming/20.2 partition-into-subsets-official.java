import java.io.*;
import java.util.*;

public class Main {
        
    public static long partitionKSubset(int n, int k) {
        // write your code here
        
        long dp[][] = new long[n+1][k+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(i==1 || j==1){
                    dp[i][j] = 1;
                }else if(i==j){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j-1] + j * dp[i-1][j];
                }
            }
        }
        
        return dp[n][k];
        
    }
    
    public static long partitionKSubsetrec(int n, int k){
        
        if(n == k){
            return 1;
        }
        
        if(n < k){
            return 0;
        }
        
        if(k == 1){
            return 1;
        }
        
        long ans = partitionKSubsetrec(n-1 , k) * k + partitionKSubsetrec(n-1, k-1);
        return ans;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        // long res = partitionKSubset(n, k);
        // System.out.println(res);
        long ans = partitionKSubsetrec(n, k);
        System.out.println(ans);
    }
    

}