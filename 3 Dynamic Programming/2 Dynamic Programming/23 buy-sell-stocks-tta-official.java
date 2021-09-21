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
        
        int minsf = arr[0];
        int mp = 0;
        int leftp[] = new int[n];
        
        for(int i=1;i<n;i++){
            
            if(arr[i] < minsf){
                minsf = arr[i];
                leftp[i] = leftp[i-1];
            }else{
                int cp = arr[i] - minsf;
                if(cp > mp){
                    mp = cp;
                }
                leftp[i] = mp;
            }
            
        }
        
        int maxsf = arr[n-1];
        mp=0;
        int rightp[] = new int[n];
        
        for(int i=n-2;i>=0;i--){
            
            if(arr[i] > maxsf){
                maxsf = arr[i];
            }else{
                int cp = maxsf - arr[i];
                if(cp > mp){
                    mp = cp;
                }
                rightp[i] = mp;
            }
            
        }
        
        int profit = 0;
        
        for(int i=0;i<n;i++){
            profit = Math.max(profit, leftp[i] + rightp[i]);
        }
        
        System.out.println(profit);
        
        
    }

}