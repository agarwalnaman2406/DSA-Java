import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		// write your code here
		StringBuilder sb = new StringBuilder(str);
		int fact = 1;
		for(int i=1;i<=str.length();i++){
		    fact = fact * i;
		}
	
		for(int i=0;i<fact;i++){
		    int q = i;
		    int r = 0;
		    for(int j=str.length();j>=1;j--){
		        r = q % j;
		        q = q / j;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		    }
		    System.out.println();
		    sb = new StringBuilder(str);
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}