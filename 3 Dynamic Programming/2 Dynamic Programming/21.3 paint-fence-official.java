import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        
        int dp[][] = new int[n+1][2];
        dp[2][0] = k;
        dp[2][1] = k * (k-1);
        for(int i=3;i<=n;i++){
            dp[i][0] = dp[i-1][1];
            dp[i][1] = (dp[i-1][0] + dp[i-1][1]) * (k-1);
        }
        
        //int ans = dp[n][0] + dp[n][1];
        int ans = pf(n , k);
        System.out.println(ans);
        
    }
    
    public static int pf(int n, int k){
        
        if(n == 1){
            return k;
        }
        
        if(n == 2){
            return k * k;
        }
        
        int ans = (pf(n-1, k)  + pf(n-2, k)) * (k-1);
        return ans;
    }
}