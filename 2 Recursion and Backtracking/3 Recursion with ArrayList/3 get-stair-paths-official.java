import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n <= 0){
            ArrayList<String> bres = new ArrayList<String>();
            if(n == 0){
                bres.add("");
            }
            return bres;
        }
        
        ArrayList<String> rres1 = getStairPaths(n-1);
        ArrayList<String> rres2 = getStairPaths(n-2);
        ArrayList<String> rres3 = getStairPaths(n-3);
        ArrayList<String> mres = new ArrayList<String>();
        
        for(int i=0;i<rres1.size();i++){
            mres.add("1" + rres1.get(i));
        }
        
        for(int i=0;i<rres2.size();i++){
            mres.add("2" + rres2.get(i));
        }
        
        for(int i=0;i<rres3.size();i++){
            mres.add("3" + rres3.get(i));
        }
        
        
        return mres;
    }

}