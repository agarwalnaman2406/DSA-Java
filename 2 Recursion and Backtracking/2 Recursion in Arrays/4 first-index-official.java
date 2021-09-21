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
        int x = scan.nextInt();
        int ans = firstIndex(arr, 0, x);
        System.out.println(ans);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        
        if(idx == arr.length){
            return -1;
        }
        
        if(arr[idx] == x){
            return idx;
        }
        
        int ans = firstIndex(arr, idx + 1, x);
        
        return ans;
    }

}