import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long dp[][] = new long[n+1][2];
    long ans = cbsrec(n, 1, dp);
    ans += cbsrec(n, 0, dp);
    System.out.println(ans);
}

public static long cbsrec(int n, int same, long dp[][]){
    
    if(n == 1){
        return 1;
    }
    
    if(dp[n][same] != 0){
        return dp[n][same];
    }
    
    long f1 = cbsrec(n-1 , 1, dp);
    long f2 = cbsrec(n-1 , 0, dp);
    
    if(same == 1){
        dp[n][1] = f2;
        return f2;
    }else{
        dp[n][0] = f1 + f2;
        return f1 + f2;
    }

    
}


public static int cbs(int n){
    
    int dp[][] = new int[2][n];
    dp[0][0] = dp[1][0] = 1;
    
    for(int i=1;i<n;i++){
        dp[0][i] = dp[1][i-1];
        dp[1][i] = dp[1][i-1] + dp[0][i-1];
    }
    
    return dp[0][n-1] + dp[1][n-1];
}



}