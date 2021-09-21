import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int arr[][] = new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j] = scan.nextInt();
        }
    }
    
    int tne = n * m;
    int count = 0;
    int rmin = 0;
    int rmax = n-1;
    int cmin = 0;
    int cmax = m-1;
    while(count < tne){
        
        //left wall
        for(int i=rmin;i<=rmax && count < tne;i++){
            System.out.println(arr[i][cmin]);
            count++;
        }
        cmin++;
        
        //bottom wall
        for(int j=cmin;j<=cmax && count < tne;j++){
            System.out.println(arr[rmax][j]);
            count++;
        }
        rmax--;
        
        //right wall
        for(int i=rmax;i>=rmin && count < tne;i--){
            System.out.println(arr[i][cmax]);
            count++;
        }
        cmax--;
        
        
        //top wall
        for(int j=cmax;j>=cmin && count < tne;j--){
            System.out.println(arr[rmin][j]);
            count++;
        }
        rmin++;
        
        
        
        
    }
     
        
    }

}