import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int ans = 0;
       int pow = 1;
       int carry = 0;
       int r1, r2, r;
       while(n1 != 0 || n2 != 0){
           r1 = n1 % 10;
           r2 = n2 % 10;
           n1 = n1/10;
           n2 = n2/10;
           r = r1 + r2 + carry;
           carry = r / b;
           r = r % b;
           ans = ans + pow * r;
           pow = pow * 10;
       }
       ans = ans + carry * pow;
       return ans;
   }
  }