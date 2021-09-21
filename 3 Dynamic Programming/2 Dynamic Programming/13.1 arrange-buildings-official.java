import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    long ob = 1;
    long os = 1;
    for(int i=2;i<=n;i++){
        long nb = os;
        long ns = ob + os;
        ob = nb;
        os = ns;
    }
    
    long total = ob + os;
    long ans = total * total;
    System.out.println(ans);
 }

}