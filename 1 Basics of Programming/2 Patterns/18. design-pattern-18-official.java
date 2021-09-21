import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int spaces = 0;
     int stars = n;
     for(int i=0;i<n;i++){
         for(int j=0;j<spaces;j++){
             System.out.print("	");
         }
         
         if(i<n/2 && i!= 0){
             int ispace = stars - 2;
             int istars = (stars - ispace) / 2;
             for(int j=0;j<istars;j++){
                 System.out.print("*	");
             }
             
             for(int j=0;j<ispace;j++){
                System.out.print("	");
             }
             
             for(int j=0;j<istars;j++){
                 System.out.print("*	");
             }
             
         }else{
             for(int j=0;j<stars;j++){
                System.out.print("*	");
            }
         }
         
         
         System.out.println();
         
         if(i<n/2){
             stars -= 2;
             spaces++;
         }else{
             stars += 2;
             spaces--;
         }
     }

 }
}