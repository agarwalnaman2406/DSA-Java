import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scan.nextInt();
    }
    
    int data = scan.nextInt();
    brokenEconomy(arr, data);
    
 }
 

public static void brokenEconomy(int arr[], int data){
    
    int l = 0;
    int r = arr.length - 1;
    int mid = 0;
    int floor = -1;
    int ceil = 0;
    
    while(l<=r){
        
        mid = l + ((r-l)/2);
        
        if(arr[mid] == data){
            System.out.println(data);
            return;
        }else if(arr[mid] < data){
            l = mid + 1;
            floor = arr[mid];
        }else if(arr[mid] > data){
            r = mid - 1;
            ceil = arr[mid];
        }
    }
    
    System.out.println(ceil);
    System.out.println(floor);
    
}

}