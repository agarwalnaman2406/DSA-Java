import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int ans = cbs(n);
    System.out.println(ans);
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