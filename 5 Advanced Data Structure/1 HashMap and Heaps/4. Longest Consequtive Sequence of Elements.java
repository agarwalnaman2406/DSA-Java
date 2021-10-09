import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    
    for(int i=0;i<n;i++){
        arr[i] = scan.nextInt();
    }
    
    HashMap<Integer, Boolean> map = new HashMap<>();
    for(int i=0;i<n;i++){
        map.put(arr[i], true);
    }
    
    for(int i=0;i<n;i++){
        if(map.containsKey(arr[i]-1)){
            map.put(arr[i], false);
        }
    }
    
    int ml = 0;
    int maxv = 0;
    for(int i=0;i<n;i++){
        if(map.containsKey(arr[i])){
            int tl = 1;
            int tmax = arr[i];
            
            while(map.containsKey(arr[i]+tl)){
                tl+=1;
            }
            if(tl>ml){
                ml = tl;
                maxv = tmax;
            }
        }
    }
    
    for(int i=0;i<ml;i++){
        System.out.println(maxv+i);
    }
    
 }

}