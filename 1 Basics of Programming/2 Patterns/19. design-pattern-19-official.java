import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            if(i==1){ // First Row
                if(j<=n/2 + 1 || j == n){
                    System.out.print("*	");
                }else{
                    System.out.print("	");
                }
             }else if(i<=n/2){ //Upper Middle Half
                if(j==n/2 + 1 || j == n){
                    System.out.print("*	");
                }else{
                    System.out.print("	");
                }
             }else if(i == (n/2) + 1){ //Middle Row
                 System.out.print("*	");
             }else if(i>n/2 + 1 && i<n){ // Lower Middle Half
                 if(j==n/2 + 1 || j == 1){
                    System.out.print("*	");
                }else{
                    System.out.print("	");
                }
             }else{ // Last Row
                if(j>=n/2 + 1 || j == 1){
                    System.out.print("*	");
                }else{
                    System.out.print("	");
                }
             }
         }
         
         System.out.println("");
     }

 }
}