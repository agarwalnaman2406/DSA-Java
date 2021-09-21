import java.io.*;
import java.util.*;

public class Main {
    
    static String keypad[] = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" ,                                 "pqrs" , "tu" , "vwx" , "yz"};
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(getKPC(str));
    }

    public static ArrayList<String> getKPC(String str) {
        
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();
        for(int i=0;i<keypad[(int) (ch-'0')].length();i++){
            String s = keypad[(int) (ch-'0')];
            char chc = s.charAt(i);
            for(int j=0;j<rres.size();j++){
                mres.add(chc + rres.get(j));
            }
        }
        
        return mres;
    }

}