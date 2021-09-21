import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		String ans = "";
		ans += str.charAt(0);
		for(int i=1;i<str.length();i++){
		    char chp = str.charAt(i-1);
		    char chc = str.charAt(i);
		    int count = chc - chp;
		    ans += count;
		    ans += chc;
		}

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}