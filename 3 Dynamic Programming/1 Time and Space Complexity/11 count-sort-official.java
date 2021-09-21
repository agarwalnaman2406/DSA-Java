import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int size = max - min + 1;
   int farr[] = new int[size];
   int presum[] = new int[size];
 
    // 1. Create Frequence Array
   for(int i=0;i<arr.length;i++){
      farr[arr[i]-min] = farr[arr[i]-min] + 1;
   }
   
   // 2.Conver freq array into prefix sum array
   presum[0] = farr[0];
   for(int i=1;i<size;i++){
      presum[i] = presum[i-1] + farr[i];
   }
   
   // 3.Create answer array
   int ans[] = new int[arr.length];
   
   for(int i=arr.length-1;i>=0;i--){
      int idx = presum[arr[i]-min];
      ans[idx-1] = arr[i];
      presum[arr[i]-min]--;
   }
   
   // 4. Fill Original Array
   for(int i=0;i<arr.length;i++){
       arr[i] = ans[i];
   }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}