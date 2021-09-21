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
        boolean ans = tss(arr, 0, tar, 0);
        System.out.println(ans);
    }
    
    public static boolean tss(int arr[], int idx, int tar, int sum){
        
        if(idx == arr.length){
            return false;
        }
        
        if(sum == tar){
            return true;
        }
        
        if(tar < sum){
            return false;
        }
        
        boolean ans1 = tss(arr, idx + 1, tar, sum + arr[idx]);
        boolean ans2 = tss(arr, idx + 1, tar, sum);
        boolean ans = ans1 || ans2;
        return ans;
    }
    
}