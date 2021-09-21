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
        
        int profit = 0;
        for(int i=0;i<=arr.length-2;i++){
            if(arr[i] < arr[i+1]){
                profit += arr[i+1] - arr[i];
            }
        }
        return profit;
    }

}