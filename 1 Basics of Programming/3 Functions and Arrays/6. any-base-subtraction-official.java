import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int ans = 0;
       int pow = 1;
       int carry = 0;
       int r, r1, r2;
       while(n2 > 0){
           r1 = n1 % 10;
           r2 = n2 % 10;
           //System.out.println("r1 = " +r1+ "r2= " +r2);
           n1 = n1 / 10;
           n2 = n2 / 10;
           r = r2 - carry - r1;
           if(r < 0){
               carry = 1;
               r = r + b;
           }else{
               carry = 0;
           }
           ans = ans + r * pow;
           pow *= 10;
       }
       return ans;
   }
  
  }