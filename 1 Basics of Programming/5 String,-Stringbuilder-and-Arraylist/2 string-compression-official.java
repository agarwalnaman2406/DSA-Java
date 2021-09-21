import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
        String str1 = "";
        char ch = str.charAt(0);
        str1 += ch;
        for(int i=0;i<str.length();i++){
            if(ch != str.charAt(i)){
                ch = str.charAt(i);
                str1 += str.charAt(i);
            }
        }
		return str1;
	}

	public static String compression2(String str){
		// write your code here
		String str1 = "";
        char ch = str.charAt(0);
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(ch != str.charAt(i)){
                str1 += ch;
                ch = str.charAt(i);
                if(count > 1){
                    str1 += count;
                }
                count = 1;
            }else{
                count++;
            }
        }
        
        str1 +=ch;
        if(count > 1){
            str1 += count;
        }
        
		return str1;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}