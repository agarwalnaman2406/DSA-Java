import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int dp[] = new int[n+1];
    System.out.println(fibtab(n));
 }

public static int fibo(int n, int dp[]){
    if(n == 0 || n == 1){
        return n;
    }
    
    if(dp[n] != 0){
        return dp[n];
    }
    
    int fibnm1 = fibo(n-1, dp);
    int fibnm2 = fibo(n-2, dp);
    int fib = fibnm1 + fibnm2;
    dp[n] = fib;
    return fib;
}

public static int fibtab(int n){
    
    int dp[] = new int[n+1];
    
    for(int i=0;i<=n;i++){
        if(i==0 || i==1){
            dp[i] = i;
        }else{
            dp[i] = dp[i-1] + dp[i-2];
        }
    }
    return dp[n];
}

}