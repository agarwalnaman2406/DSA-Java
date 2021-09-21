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
        int dp[][] = new int[arr.length][arr[0].length];
        //System.out.println(goldmineTabu(arr));
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max, goldmineMemo(i, 0, arr, dp));
        }
        System.out.println(max);
    }
    
    public static int goldmineTabu(int arr[][]){
        
        int dp[][] = new int[arr.length][arr[0].length];
        for(int j=arr[0].length-1;j>=0;j--){
            for(int i=0;i<arr.length;i++){
                if(j==arr[0].length-1){
                    dp[i][j] = arr[i][j];
                }else if(i == 0){
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j+1]) + arr[i][j];
                }else if(i==arr.length-1){
                    dp[i][j] = Math.max(dp[i][j+1], dp[i-1][j+1]) + arr[i][j];
                }else{
                    dp[i][j] = Math.max(Math.max(dp[i][j+1], dp[i-1][j+1]), dp[i+1][j+1]) + arr[i][j];
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
        
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }
    
    public static int goldmineMemo(int sr, int sc, int arr[][], int dp[][]){
        
        if(sr >= arr.length || sr < 0){
            return 0;
        }
        
        if(dp[sr][sc] != 0){
            return dp[sr][sc];
        }
        
        if(sc == arr[0].length - 1){
            dp[sr][sc] = arr[sr][sc];
            return arr[sr][sc];
        }
        
        int ans1 = goldmineMemo(sr-1, sc+1, arr, dp);
        int ans2 = goldmineMemo(sr, sc+1, arr, dp);
        int ans3 = goldmineMemo(sr+1, sc+1, arr, dp);
        int ans = Math.max(ans1, Math.max(ans2, ans3)) + arr[sr][sc];
        dp[sr][sc] = ans;
        return ans;
    }

}