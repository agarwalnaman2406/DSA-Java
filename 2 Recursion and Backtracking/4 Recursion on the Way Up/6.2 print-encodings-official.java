import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        printEncodings(str, "");
        
    }

    public static void printEncodings(String str, String ans) {
        
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        
        if(ch == '0'){
            return;
        }
        
        if(str.length() == 1){
            int chv = ch - '0';
            char chans = (char) ('a' + chv - 1);
            ans = ans + chans;
            System.out.println(ans);
            return;
        }
        
        int chv = ch - '0';
        char chans = (char) ('a' + chv - 1);
        printEncodings(str.substring(1), ans + chans);
        
        int l = Integer.parseInt(str.substring(0,2));
        if(l <= 26){
            chans = (char) ('a' + l - 1);
            printEncodings(str.substring(2), ans + chans);
        }
        
        
        

    }

}