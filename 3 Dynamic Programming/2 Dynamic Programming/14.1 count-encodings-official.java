import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int dp[] = new int[str.length()];
        int ans = ce(str, 0);
        System.out.println(ans);
    }
    
    public static int ce(String str, int idx){
        
        if(idx == str.length()){
            return 1;
        }
        
        if(str.charAt(idx) == '0'){
            return 0;
        }
        
        int f1 = ce(str, idx+1);
        int f2 = 0;
        if((idx+1 < str.length()) && Integer.parseInt(str.substring(idx, idx+2)) <= 26){
            f2 = ce(str, idx+2);
        }
        int ans = f1+f2;
        return ans;
    }
}