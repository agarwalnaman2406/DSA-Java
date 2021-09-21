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
        
        int ans = lis(arr, 0, -1);
        System.out.println(ans);
        
    }
    // ilse -> index of last selected element
    public static int lis(int arr[], int idx, int ilse){
        if(idx == arr.length){
            return 0;
        }
        
        int f1 = 0 + lis(arr, idx+1, ilse);
        int f2 = 0;
        if(ilse == -1 || arr[idx] > arr[ilse]){
            f2 = 1 + lis(arr, idx+1, idx);
        }
        return Math.max(f1, f2);
    }

}