import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for(int i=0;i<rres.size();i++){
            mres.add(rres.get(i));
        }
        
        for(int i=0;i<rres.size();i++){
            String ans = ch + rres.get(i);
            mres.add(ans);
        }
        
        return mres;
    }

}