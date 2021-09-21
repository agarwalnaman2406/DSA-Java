import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here 
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int rev = 0;
  int count = 1;
  while(n!=0){
      int temp = n%10;
      n = n/10;
      int num = (int)Math.pow(10, temp-1) * count;
      rev = rev + num;
      count++;
  }
  
  System.out.println(rev);
 }
}