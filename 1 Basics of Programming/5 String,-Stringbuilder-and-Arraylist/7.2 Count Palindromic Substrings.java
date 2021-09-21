import java.io.*;
import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		int ans = str.length();
		
		for(int idx=0;idx<str.length();idx++){
		    int left = idx -1;
		    int right = idx + 1;
		    while((left >=0) && (right < str.length()) && (str.charAt(left) == str.charAt(right))){
		        ans+=1;
		        left--;
		        right++;
		    }
		    
		    left = idx;
		    right = idx + 1;
		    while((left >=0) && (right < str.length()) && (str.charAt(left) == str.charAt(right))){
		        ans+=1;
		        left--;
		        right++;
		    }
		}
		
		System.out.println(ans);
		
	}

}