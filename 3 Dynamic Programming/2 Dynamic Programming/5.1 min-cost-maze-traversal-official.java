import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        
        int dp[][] = new int[n][m];;
        
        System.out.println(minCost(0, 0, arr, dp));
    }
    
    public static int minCost(int sr, int sc, int arr[][], int dp[][]){
        
        if(sr >= arr.length || sc >= arr[0].length){
            return Integer.MAX_VALUE;
        }
        
        if(sr == arr.length - 1 && sc == arr[0].length - 1){
            return arr[sr][sc];
        }
        
        if(dp[sr][sc] != 0){
            return dp[sr][sc];
        }
        
        int ans1 = minCost(sr, sc+1, arr, dp);
        int ans2 = minCost(sr+1, sc, arr, dp);
        int ans = Math.min(ans1, ans2) + arr[sr][sc];
        dp[sr][sc] = ans;
        return ans;
    }

}