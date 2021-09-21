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
        int ans = maxprofit(arr);
        System.out.println(ans);
    }
    
    public static int maxprofit(int arr[]){
        
        int buy[] = new int[arr.length];
        int sell[] = new int[arr.length];
        
        buy[0] = -arr[0];
        sell[0] = 0;
        buy[1] = Math.max(-arr[1], -arr[0]);
        sell[1] = Math.max(sell[0], buy[0] + arr[1]);
        for(int i=2;i<arr.length;i++){
            
            buy[i] = Math.max(buy[i-1], sell[i-2] - arr[i]);
            sell[i] = Math.max(sell[i-1], arr[i] + buy[i-1]);
            
        }
        int n = arr.length;
        return Math.max(buy[n-1] , sell[n-1]);
    }

}