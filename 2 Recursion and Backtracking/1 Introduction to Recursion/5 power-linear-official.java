import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if( n == 0){
            return 1;
        }
        
        
        int ans = 0;
        if(n % 2 == 0){
            ans = power(x, n/2);
            ans = ans * ans;
        }else{
            ans = power(x, n/2);
            ans = ans * ans * x;
        }
        
        return ans;
    }

}