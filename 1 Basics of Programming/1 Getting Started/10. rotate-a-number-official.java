import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int k = scan.nextInt();
     int count = 0;
         int temp = n;
         while(temp != 0){
             temp = temp/10;
             count++;
         }
         k = k % count;
     if(k > 0){
         int div = (int)Math.pow(10,k);
         int rem = n % div;
         int quo = n/div;
         int pr = count - k;
         int ans = rem * (int)Math.pow(10,pr) + quo;
         System.out.println(ans);
     }else{
         k = -k;
         int pr = count - k;
         int div = (int)Math.pow(10,pr);
         int rem = n % div;
         int quo = n/div;
         int ans = rem * (int)Math.pow(10,k) + quo;
         System.out.println(ans);
     }
    }
   }