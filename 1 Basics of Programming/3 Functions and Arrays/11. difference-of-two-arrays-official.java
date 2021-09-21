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
    
    int n = n2;
    
    int ans[] = new int[n];
    int b = 0;
    int i = n1-1;
    int j = n2-1;
    
    while(n != 0){
        int sum = 0;
        if(i >= 0 && j >= 0){
            sum = arr2[j] - arr1[i] - b; 
            i--;
            j--;
        }else if(i < 0){
            sum = arr2[j] - b;
            j--;
        }else if(j < 0){
            sum = arr1[i] - b;
            i--;
        }
        
        if(sum < 0){
            b = 1;
            sum += 10;
        }else{
            b = 0;
        }
        
        ans[n-1] = sum;
        n--;
    }
    
    for(int x=0;x<ans.length;x++){
        if(x == 0  && ans[x] == 0){
            
        }else{
            System.out.println(ans[x]);
        }
    }
    
 }

}