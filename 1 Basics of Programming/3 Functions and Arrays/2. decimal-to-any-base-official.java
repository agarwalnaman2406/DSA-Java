import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
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