import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scan.nextInt();
    }
    
    int nos = (int)Math.pow(2,n);
    int power = (int)Math.pow(10,n-1);
    for(int i=0;i<nos;i++){
        int binaryNumber = getValueInBase(i);
        power = (int)Math.pow(10,n-1);
        for(int j=0;j<n;j++){
            int q = binaryNumber / power;
            binaryNumber = binaryNumber % power;
            power = power / 10;
            if(q == 1){
                System.out.print(arr[j] + "	");
            }else{
                System.out.print("-	");
            }
        }
        System.out.println();
    }
    
 }
 
   public static int getValueInBase(int n){
       // write code here
       int nb = 0;
       int val = 1;
       while(n != 0){
           int r = n % 2;
           n = n / 2;
           nb = r * val + nb;
           val = val * 10;
       }
       return nb;
    }

}