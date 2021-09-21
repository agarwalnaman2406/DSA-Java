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
        int amt = scan.nextInt();
        
        int dp[] = new int[amt+1];
        dp[0] = 1;
        for(int i=0;i<n;i++){
            for(int j=arr[i];j<=amt;j++){
                dp[j] = dp[j] + dp[j-arr[i]];
            }
        }
        
        
        System.out.println(dp[amt]);
        
    }
}