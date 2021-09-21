import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
      int ansDecBase = getValueIndecimal(n, sourceBase);
      int ansDestBase = getValueInBase(ansDecBase, destBase);
      System.out.println(ansDestBase);
   }
  
  public static int getValueIndecimal(int n, int b){
      // write your code here
      int ans = 0;
      int pow = 1;
      while(n != 0){
          int r = n % 10;
          //System.out.println(r);
          n = n / 10;
          ans = ans + r * pow;
          pow = pow * b;
      }
      return ans;
   }
   
   public static int getValueInBase(int n, int b){
       // write code here
       int nb = 0;
       int val = 1;
       while(n != 0){
           int r = n % b;
           n = n / b;
           nb = r * val + nb;
           val = val * 10;
       }
       return nb;
   }
  
  }