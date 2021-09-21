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
        int dp[] = new int[n];
       System.out.println(csMemo(0, n, arr, dp));
    }
    
    public static int cs(int n, int arr[]){
        
        int dp[] = new int[n];
        for(int i=n-2;i>=0;i--){
            int min = Integer.MAX_VALUE - 1;
            for(int j=1;j<=arr[i];j++){
                if(i+j<n){
                    min = Math.min(min, dp[i+j]);
                }
            }
            dp[i] = 1 + min;
        }
        
        return dp[0];
    }
    
    public static int csMemo(int i, int n, int arr[], int dp[]){
        
        if(i >= n){
            return 0;
        }
        
        int min = Integer.MAX_VALUE - 1;
        for(int jumps=1;jumps<=arr[i];jumps++){
            int ans = csMemo(i+jumps, n, arr, dp);
            min = Math.min(min, ans);
        }
        dp[i] = min + 1;
        return dp[i];
    }
    
    public static int csOpt(int arr[]){
        
        int steps = 0;
        
        for(int i=0;i<arr.length;){
            
            if(arr[i] == 0){
                break;
            }
            int max = 0;
            int maxidx = 0;
            for(int jump=1;jump<=arr[i];jump++){
                int j = i + jump;
                if(j == arr.length - 1){
                    steps++;
                    return steps;
                }
            
                if(j+arr[j] >= max){
                    max = j + arr[j];
                    maxidx = j;
                }
            }
            
            i = maxidx;
            steps++;
        }
        
        return Integer.MAX_VALUE;
    }
    

}