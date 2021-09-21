import java.io.*;
import java.util.*;

public class Main {

    public static boolean isPalindrome(String substr){
        int l = 0;
        int r = substr.length() - 1;
        while(l < r){
            char chl = substr.charAt(l);
            char chr = substr.charAt(r);
            
            if(chl != chr){
                return false;
            }else{
                l++;
                r--;
            }
            
        }
        
        return true;
    }

	public static void solution(String str){
		//write your code here
		int count = 0;
		for(int i=0;i<str.length();i++){
		    for(int j=i+1;j<=str.length();j++){
		        String substr = str.substring(i,j);
		        if(isPalindrome(substr)){
		            count++;
		        }
		    }
		}
		
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}