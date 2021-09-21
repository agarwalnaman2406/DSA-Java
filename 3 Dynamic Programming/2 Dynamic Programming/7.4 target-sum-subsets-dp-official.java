import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int tar = scan.nextInt();
        Boolean dp[][] = new Boolean[n+1][tar+1];
        //boolean ans = tss(arr, 0, tar, 0, dp);
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=tar;j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        boolean ans = tssTabu(arr, tar, 0);
        System.out.println(ans);
    }
    
    public static boolean tssTabu(int arr[], int tar, int sum){
        
        Boolean dp[][] = new Boolean[arr.length+1][tar+1];
        
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=tar;j++){
                if(i==0){
                    dp[i][j] = false;
                }else if(j==0){
                    dp[i][j] = true;
                }else{
                    if(j >= arr[i-1]){
                        dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                    
                }
            }
        }
        
        return dp[arr.length][tar];
        
    }
    
    public static boolean tss(int arr[], int idx, int tar, int sum, Boolean dp[][]){
        
        if(idx == arr.length){
            return false;
        }
        
        
        if(sum == tar){
            return true;
        }
        
        if(tar < sum){
            return false;
        }
        
        if(dp[idx][sum] != null){
            return dp[idx][sum];
        }
        
        boolean ans1 = tss(arr, idx + 1, tar, sum + arr[idx], dp);
        boolean ans2 = tss(arr, idx + 1, tar, sum, dp);
        boolean ans = ans1 || ans2;
        dp[idx][sum] = ans;
        return ans;
    }
    
}