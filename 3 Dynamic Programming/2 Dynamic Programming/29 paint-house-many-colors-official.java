import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[][] = new int[n][k];
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        
        int dp[][] = new int[n][k];
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        
        for(int j=0;j<k;j++){
            dp[0][j] = arr[0][j];
            if(arr[0][j] <= least){
                sleast = least;
                least = arr[0][j];
            }else if(arr[0][j] <= sleast){
                sleast = arr[0][j];
            }
        }
        
        
        for(int i=1;i<n;i++){
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;
            
            for(int j=0;j<k;j++){
                
                if(dp[i-1][j] == least){
                    dp[i][j] = arr[i][j] + sleast;
                }else{
                    dp[i][j] = arr[i][j] + least;
                }
                
                if(dp[i][j] <= nleast){
                    nsleast = nleast;
                    nleast = dp[i][j];
                }else if(dp[i][j] <= nsleast){
                    nsleast = dp[i][j];
                }
                
                
            }
            
            least = nleast;
            sleast = nsleast;
            
        }
        
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<k;j++){
            ans = Math.min(ans, dp[n-1][j]);
        }
        
        System.out.println(ans);
    }
    
    
}