import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int is = n*2 - 3;
     int stars = 1;
     for(int i=0;i<n;i++){
         int count = 1;
         for(int j=0;j<stars;j++){
             System.out.print(count + "	");
             count++;
         }
         for(int j=0;j<is;j++){
             System.out.print("	");
         }
         if(stars == n){
             count--;
             stars--;
         }
         for(int j=0;j<stars;j++){
             count--;
             System.out.print(count + "	");
         }
         System.out.println();
         stars++;
         is -= 2;
     }

 }
}