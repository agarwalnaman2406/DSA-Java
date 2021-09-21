import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        printSS(str.substring(1), ans + str.charAt(0));
        printSS(str.substring(1), ans);
        
        return;
    }

}