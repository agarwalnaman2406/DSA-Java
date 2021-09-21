import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        
        int ans = n * factorial(n - 1);
        
        return ans;
    }

}