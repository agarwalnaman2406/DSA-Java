import java.io.*;
import java.util.*;

public class Main {
    
    static String keypad[] = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" ,                                 "pqrs" , "tu" , "vwx" , "yz"};
    
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        printKPC(str, "");
        
    }

    public static void printKPC(String str, String asf) {
        
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        char ch = str.charAt(0);
        for(int i=0;i<keypad[(int)ch - '0'].length();i++){
            char cha = keypad[(int) ch-'0'].charAt(i);
            printKPC(str.substring(1), asf + cha);
        }
        
        return;
    }

}