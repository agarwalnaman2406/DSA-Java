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
        
        //System.out.println(minCost(0, 0, arr, dp));
        System.out.println(micCostTab(arr));
    }
    
    public static int micCostTab(int arr[][]){
        
        int dp[][] = new int[arr.length][arr[0].length];
        
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[0].length-1;j>=0;j--){
                if(i==arr.length-1 && j==arr[0].length-1){
                    dp[i][j] = arr[i][j];
                }else if(i==arr.length-1){
                    dp[i][j] = dp[i][j+1] + arr[i][j];
                }else if(j == arr[0].length-1){
                    dp[i][j] = dp[i+1][j] + arr[i][j];
                }else{
                    dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j]) + arr[i][j];
                }
            }
        }
        
        return dp[0][0];
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