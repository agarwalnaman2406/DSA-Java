import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int dp[] = new int[n+1];
        
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + (i-1) * dp[i-2]; 
        }
        
        //System.out.println(dp[n]);
        int ans = fprec(n);
        System.out.println(ans);
    }
    
    public static int fprec(int n){
        
        if(n == 1){
            return 1;
        }
        
        if(n == 2){
            return 2;
        }
        
        int ans = fprec(n-1) + fprec(n-2) * (n-1);
        return ans;
    }

}