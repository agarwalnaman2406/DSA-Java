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
        
        
        for(int dig=0; dig<n; dig++){
            for(int i=0,j=dig;j<n;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
        
    }

}