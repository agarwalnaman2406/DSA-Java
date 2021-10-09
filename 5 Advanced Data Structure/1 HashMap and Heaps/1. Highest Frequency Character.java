import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int idx = 0;
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int temp = map.get(str.charAt(i))+1;
                if(temp>max){
                    max = temp;
                    idx = i;
                }
                map.put(str.charAt(i), temp);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        
        System.out.println(str.charAt(idx));
        
    }

}