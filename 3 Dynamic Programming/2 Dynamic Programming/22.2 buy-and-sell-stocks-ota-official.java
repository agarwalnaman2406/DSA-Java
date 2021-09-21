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
        
        // Left To Right
        int st = arr[0];
        int profit = 0;
        
        for(int i=1;i<n;i++){
            
            if(arr[i] < st){
                st = arr[i];
            }else if(arr[i] >= st){
                int cp = arr[i] - st;
                if(cp > profit){
                    profit = cp;
                }
            }
            
        }
        
        // Right To Left
        
        int msf = arr[n-1];
        int maxprofit = 0;
        for(int i=n-2;i>=0;i--){
            
            if(arr[i] > msf){
                msf = arr[i];
            }else{
                int cp = msf - arr[i];
                if(cp > maxprofit){
                    maxprofit = cp;
                }
            }
            
        }
        
        System.out.println(maxprofit);
        
    }

}