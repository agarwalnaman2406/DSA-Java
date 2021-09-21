import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		String ans = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                char lc = (char) ('a' + ch - 'A');
                ans += lc;
            }else{
                char uc = (char)('A' + ch - 'a');
                ans += uc;
            }
        }
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}