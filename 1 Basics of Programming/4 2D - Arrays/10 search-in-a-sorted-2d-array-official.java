import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        
        int x = scan.nextInt();
        
        int i = 0;
        int j = n-1;
        while(i < n && j > 0){
            if(arr[i][j] == x){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(x > arr[i][j]){
                i++;
            }else{
                j--;
            }
        }
        
        System.out.println("Not Found");
        
    }

}