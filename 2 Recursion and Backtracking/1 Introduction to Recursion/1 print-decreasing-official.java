import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n == 0){
            return ;
        }
        
        System.out.println(n);
        printDecreasing(n-1);
    }

}