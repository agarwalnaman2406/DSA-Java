import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(getMazePaths(0, 0 , n-1, m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr > dr || sc > dc){
            ArrayList<String> bres = new ArrayList<String>();
            return bres;
        }
        
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> rresh = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> rresv = getMazePaths(sr + 1, sc, dr, dc);
        ArrayList<String> mres = new ArrayList<String>();
        for(int i=0;i<rresh.size();i++){
            mres.add("h" + rresh.get(i));
        }
        
        for(int i=0;i<rresv.size();i++){
            mres.add("v" + rresv.get(i));
        }
        
        
        return mres;
    }

}