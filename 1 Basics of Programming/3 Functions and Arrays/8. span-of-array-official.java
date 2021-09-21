import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    int min = Integer.MAX_VALUE;
    int max = 0;
    for(int i=0;i<n;i++){
        arr[i] = scan.nextInt();
        if(arr[i] > max){
            max = arr[i];
        }else if(arr[i] < min){
            min = arr[i];
        }
    }
    
    System.out.println(max - min);
 }

}