import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        int k = scan.nextInt();
        
        int dp[][] = new int[k+1][n];
        
        for(int i=1;i<=k;i++){
            int max = Integer.MIN_VALUE;
            for(int j=1;j<n;j++){
                max = Math.max(dp[i-1][j-1]-arr[j-1], max);
                dp[i][j] = Math.max(max+arr[j], dp[i][j-1]);
            }
        }
        
        System.out.println(dp[k][n-1]);
        
    }

}