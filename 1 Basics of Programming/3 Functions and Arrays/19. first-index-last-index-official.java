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
    //System.out.println(data);
    int fi = -1;
    int li = -1;
    
    int mid = 0;
    int l = 0;
    int r = arr.length - 1;
    
    while(l<=r){
        mid = l + ((r-l)/2);
        if(arr[mid] < data){
            l = mid + 1;
        }else if(arr[mid] > data){
            r = mid - 1;
        }else{
            fi = mid;
            r = mid - 1;
        }
        
    }
    
    
    l = 0;
    r = arr.length - 1;
    
    while(l<=r){
        mid = l + ((r-l)/2);
        if(arr[mid] < data){
            l = mid + 1;
        }else if(arr[mid] > data){
            r = mid - 1;
        }else{
            li = mid;
            l = mid + 1;
        }
    }
    
    
    
    System.out.println(fi);
    System.out.println(li);
    
    
 }

}