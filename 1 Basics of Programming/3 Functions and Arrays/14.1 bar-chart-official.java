import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    int max = 0;
    for(int i=0;i<n;i++){
        arr[i] = scan.nextInt();
        if(arr[i] > max){
            max = arr[i];
        }
    }
    
    for(int i=max;i>0;i--){
        for(int j=0;j<n;j++){
            if(arr[j] >= i){
                System.out.print("*	");
            }else{
                System.out.print("	");
            }
        }
        System.out.println();
    }
    
 }

}