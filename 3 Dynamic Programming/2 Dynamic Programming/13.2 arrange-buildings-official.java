import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    long ob = 1;
    long os = 1;
    for(int i=2;i<=n;i++){
        long nb = os;
        long ns = ob + os;
        ob = nb;
        os = ns;
    }
    
    long total = ob + os;
    long ans = total * total;
    long dp[][] = new long[n+1][2];
    long recans = abmemo(n, 1, dp);
    recans += abmemo(n ,0, dp);
    System.out.println(ans);
 }
 
 // 1 - building was there in last step
 // 0 - No Building was there in last step
 
public static long abmemo(int n, int b, long dp[][]){
   
   if(n == 1){
       return 1;
   }
   
   if(dp[n][b] != 0){
       return dp[n][b];
   }
   
   long f1 = abmemo(n-1, 1, dp);
   long f2 = abmemo(n-1, 0, dp);
   
   if(b == 1){
       dp[n][b] = f2;
       return f2;
   }else{
       dp[n][b] = f1 + f2;
       return f1 + f2;
   }
    
} 

}