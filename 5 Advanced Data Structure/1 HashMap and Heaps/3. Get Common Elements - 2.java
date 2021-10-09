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
    
    int n2 = scan.nextInt();
    int arr2[] = new int[n2];
    
    for(int j=0;j<n2;j++){
        arr2[j] = scan.nextInt();
    }
    
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
        if(!map.containsKey(arr[i])){
            map.put(arr[i], 1);
        }else{
            int temp = map.get(arr[i])+1;
            map.put(arr[i], temp);
        }
    }
    
    for(int i=0;i<n2;i++){
        if(map.containsKey(arr2[i])){
            System.out.println(arr2[i]);
            int idx = map.get(arr2[i])-1;
            if(idx == 0){
                map.remove(arr2[i]);
            }else{
                map.put(arr2[i],idx);
            }
        }
    }
 }

}