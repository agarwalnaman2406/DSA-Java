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
        
        System.out.println(goldmineTabu(arr));
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
        
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }

}