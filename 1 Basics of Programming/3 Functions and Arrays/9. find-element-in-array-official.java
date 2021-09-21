import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    int num;
    for(int i=0;i<n;i++){
        arr[i] = scan.nextInt();
    }
    num = scan.nextInt();
    int flag = 0;
    for(int i=0;i<n;i++){
        if(arr[i] == num){
            System.out.print(i);
            flag = 1;
            break;
        }
    }
    
    if(flag == 0){
        System.out.println("-1");
    }
    
    
 }

}