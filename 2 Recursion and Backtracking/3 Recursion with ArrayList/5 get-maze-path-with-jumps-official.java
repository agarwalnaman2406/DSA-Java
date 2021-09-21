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
        
        
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        
        if(sr > dr || sc > dc){
            ArrayList<String> bres = new ArrayList<String>();
            return bres;
        }
        
        
        ArrayList<String> mres = new ArrayList<String>();
        
        for(int i=1;i<=dc-sc;i++){
            ArrayList<String> rresh = getMazePaths(sr, sc + i, dr, dc);
            for(int j=0;j<rresh.size();j++){
                mres.add("h" + i + rresh.get(j));
            }
        }
        
        for(int i=1;i<=dr-sr;i++){
            ArrayList<String> rresv = getMazePaths(sr + i, sc, dr, dc);
            for(int j=0;j<rresv.size();j++){
                mres.add("v" + i + rresv.get(j));
            }
        }
        
        for(int i=1;i<=dr-sr && i<=dc-sc;i++){
            ArrayList<String> rresd = getMazePaths(sr + i, sc + i, dr, dc);
            for(int j=0;j<rresd.size();j++){
                mres.add("d" + i + rresd.get(j));
            }
        }
        
        
        return mres;
    }

}