import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int m1 = scan.nextInt();
    int arr1[][] = new int[n1][m1];
    for(int i=0;i<n1;i++){
        for(int j=0;j<m1;j++){
            arr1[i][j] = scan.nextInt();
        }
    }
    
    int n2 = scan.nextInt();
    int m2 = scan.nextInt();
    int arr2[][] = new int[n2][m2];
    for(int i=0;i<n2;i++){
        for(int j=0;j<m2;j++){
            arr2[i][j] = scan.nextInt();
        }
    }
    
    int arr[][] = new int[n1][m2];
    if(m1 == n2){
        
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                int ans = 0;
                for(int k=0; k<m1;k++){
                    ans = ans + (arr1[i][k] * arr2[k][j]);
                }
                arr[i][j] = ans;
            }
        }
        
        
    }else{
        System.out.println("Invalid input");
        return;
    }
    
    for(int i=0;i<n1;i++){
        for(int j=0;j<m2;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
    
    
    
 }

}