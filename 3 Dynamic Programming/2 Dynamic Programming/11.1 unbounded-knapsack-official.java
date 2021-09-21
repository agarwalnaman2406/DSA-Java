import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int val[] = new int[n];
            int wt[] = new int[n];
            
            for(int i=0;i<n;i++){
                val[i] = scan.nextInt();
            }
            
            for(int i=0;i<n;i++){
                wt[i] = scan.nextInt();
            }
            
            int cap = scan.nextInt(); 
            
            int ans = ubknapTab(val, wt, cap);
            System.out.println(ans);
	    }
	    
	    public static int ubknapTab(int val[], int wt[], int cap){
	        
	        int dp[] = new int[cap+1];
	        dp[0] = 0;
	        for(int i=0;i<val.length;i++){
	            for(int j=wt[i];j<=cap;j++){
	                dp[j] = Math.max(dp[j], dp[j-wt[i]] + val[i]);
	            }
	        }
	        
	        return dp[cap];
	    }
	    
	}