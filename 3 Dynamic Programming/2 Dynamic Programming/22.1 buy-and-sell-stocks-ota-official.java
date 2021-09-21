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
        
        System.out.println(profit);
        
    }

}