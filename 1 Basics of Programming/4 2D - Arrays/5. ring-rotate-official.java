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
        
        int s = scan.nextInt();
        int r = scan.nextInt();
        
        shellRotate(arr, s, r);
        display(arr);
    
    }
    

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void shellRotate(int arr[][], int s, int r){
        int a[] = fill1DFfrom2D(arr, s);
        rotate1D(a, r);
        fill2Dfrom1D(arr, s, a);
    }
    
    public static int[] fill1DFfrom2D(int arr[][], int s){
        int minrow = s - 1;
        int maxrow = arr.length - s;
        int mincol = s - 1;
        int maxcol = arr[0].length - s;
        int n = 2 * (maxrow - minrow + 1) + 2 * (maxcol - mincol - 1);
        int a[] = new int[n];
        int count = 0;
        for(int i=minrow;i<=maxrow;i++){
            a[count] = arr[i][mincol];
            count++;
        }
        mincol++;
        for(int j=mincol;j<=maxcol;j++){
            a[count] = arr[maxrow][j];
            count++;
        }
        maxrow--;
        for(int i=maxrow;i>=minrow;i--){
            a[count] = arr[i][maxcol];
            count++;
        }
        maxcol--;
        for(int j=maxcol;j>=mincol;j--){
            a[count] = arr[minrow][j];
            count++;
        }
        minrow++;
        return a;
        
    }
    
    public static void rotate1D(int a[],int r){
        
        r = r % a.length;
        if(r < 0){
            r = r + a.length;
        }
        
        reverse(a, 0, a.length - 1);
        reverse(a,0,r-1);
        reverse(a, r, a.length - 1);
    }
    
    public static void reverse(int a[], int left, int right){
        while(left < right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void fill2Dfrom1D(int arr[][], int s, int a[]){
        int minrow = s - 1;
        int maxrow = arr.length - s;
        int mincol = s - 1;
        int maxcol = arr[0].length - s;
        int n = a.length;
        int count = 0;
        
        for(int i=minrow;i<=maxrow && count < n;i++){
           arr[i][mincol] =  a[count];
            count++;
        }
        mincol++;
        for(int j=mincol;j<=maxcol && count < n;j++){
            arr[maxrow][j] = a[count];
            count++;
        }
        maxrow--;
        for(int i=maxrow;i>=minrow && count < n;i--){
            arr[i][maxcol] = a[count];
            count++;
        }
        maxcol--;
        for(int j=maxcol;j>=mincol && count < n;j--){
            arr[minrow][j] = a[count];
            count++;
        }
        minrow++;
        
    }

}