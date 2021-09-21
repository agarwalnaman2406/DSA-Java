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
        int ans = maxOfArray(arr, 0);
        System.out.println(ans);
    }

    public static int maxOfArray(int[] arr, int idx){
        
        if(idx == arr.length - 1){
            return arr[idx];
        }
        
        int maxx = maxOfArray(arr, idx+1);
        int ans = Math.max(maxx, arr[idx]);
        return ans;
    }

}