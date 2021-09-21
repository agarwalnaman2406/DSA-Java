import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int d = 0;
    while(n != 0){
        d++;
        n = n/10;
    }
    System.out.println(d);
   }
  }