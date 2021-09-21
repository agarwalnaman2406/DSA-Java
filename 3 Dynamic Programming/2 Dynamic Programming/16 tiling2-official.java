import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int dp[] = new int[n+1];
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            if(i == m){
                dp[i] = 2;
            }else if(i > m){
             dp[i] = dp[i-1] + dp[i-m];   
            }else{
                dp[i] = dp[i-1];
            }
        }
        
        System.out.println(dp[n]);
    }
}