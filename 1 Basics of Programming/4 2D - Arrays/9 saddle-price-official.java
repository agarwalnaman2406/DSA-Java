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
        
        
        int colno;
        int min;
        for(int i=0;i<n;i++){
            min = arr[i][0];
            colno = 0;
            for(int j=1;j<n;j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                    colno = j;
                }
            }
            
            boolean vc = true;
            for(int j=0;j<n;j++){
                if(arr[j][colno] > min){
                    vc = false;
                    break;
                }
            }
            
            if(vc == true){
                System.out.println(min);
                return;
            }
            
            
        }
        
        System.out.println("Invalid input");
        
        
    }

}