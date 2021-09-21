import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int sumlastinc = arr[0];
        int sumlastexc = 0;
        
        for(int i=1;i<n;i++){
            int newlastinc = sumlastexc + arr[i];
            int newlastexc = Math.max(sumlastinc, sumlastexc);
            sumlastinc = newlastinc;
            sumlastexc = newlastexc;
        }
        
        System.out.println(Math.max(sumlastinc, sumlastexc));
    }
}