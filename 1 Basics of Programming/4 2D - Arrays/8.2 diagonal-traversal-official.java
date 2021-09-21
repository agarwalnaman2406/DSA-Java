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
        
        
        // Printing Diagonal From Downside
        /*
        
        int noOfDig = n + m - 1;
        int count = n-1;
        int upDiag = 0;
        for(int dig=1;dig<=noOfDig;dig++){
            
            if(count != 0){
                for(int i=count,j=0;i<n && j<m;i++,j++){
                    System.out.print(arr[i][j] + "  ");
                }
                count--;
                System.out.println("  ");
            }else if(count == 0){
                for(int i=0,j=i+upDiag;i<n && j<m;i++,j++){
                    System.out.print(arr[i][j] + "  ");
                }
                upDiag++;
                System.out.println("  ");
            }
            
        }
        
        */
        
        for(int dig=0; dig<n; dig++){
            for(int i=0,j=dig;j<n;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
        
    }

}