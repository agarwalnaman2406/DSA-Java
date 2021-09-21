import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      int n1, n2;
      Scanner scan = new Scanner(System.in);
      n1 = scan.nextInt();
      n2 = scan.nextInt();
      
      int div = n1;
      int dvd = n2;
     
      while(dvd % div != 0){
          int rem = dvd % div;
          dvd = div;
          div = rem;
      }
      
      int gcd = div;
      int lcm = (n1 * n2) / gcd;
      
      System.out.println(gcd);
      System.out.println(lcm);
      
     }
    }