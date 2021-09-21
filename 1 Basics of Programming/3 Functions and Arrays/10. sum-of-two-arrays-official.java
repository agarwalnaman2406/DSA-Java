import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int arr1[] = new int[n1];
    
    for(int i=0;i<n1;i++){
        arr1[i] = scan.nextInt();
    }
    
    int n2 = scan.nextInt();
    int arr2[] = new int[n2];
    
    for(int i=0;i<n2;i++){
        arr2[i] = scan.nextInt();
    }
    
    int max;
    if(n1 > n2){
        max = n1;
    }else{
        max = n2;
    }
    
    int i = n1 - 1;
    int j = n2 - 1;
    int arr[] = new int[max];
    int c = 0;
    while(max != 0){
        int sum = 0;
        if(i >= 0 && j >= 0){
            sum = arr1[i] + arr2[j] + c;
            i--;
            j--;
        }else if(i < 0){
            sum = arr2[j] + c;
            j--;
        }else if(j < 0){
             sum = arr1[i] + c;
             i--;
        }
     
        c = sum / 10;
        sum = sum % 10;
        arr[max - 1] = sum;
        max--;
        
    }
    
    if(c != 0){
        System.out.println(c);
    }
    for(int x =0; x<arr.length; x++){
        System.out.println(arr[x]);
    }
    
 }

}