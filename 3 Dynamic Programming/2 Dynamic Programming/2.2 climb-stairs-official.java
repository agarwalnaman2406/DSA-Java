import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int dp[] = new int[n+1];
        
        
        // Tabulization
        for(int i=0;i<=n;i++){
            if(i==0){
                dp[i] = 1;
            }else if(i == 1){
                dp[i] = dp[i-1];
            }else if(i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        
        //System.out.println(dp[n]);
        
        // Memorization
        int dpp[] = new int[n+1];
        System.out.println(climbStairs(n, dpp));
        
    }
    
    public static int climbStairs(int n, int dpp[]){
        if(n < 0){
            return 0;
        }
        
        if(n == 0){
            return 1;
        }
        
        if(dpp[n] != 0){
            return dpp[n];
        }
        
        int x = climbStairs(n-1, dpp);
        int y = climbStairs(n-2, dpp);
        int z = climbStairs(n-3, dpp);
        dpp[n] = x + y + z;
        return dpp[n];
    }
    

}