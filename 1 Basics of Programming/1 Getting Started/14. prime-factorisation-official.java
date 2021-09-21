import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int div = 2;
  int dvd = n;
  
  while(dvd > div){
      if(dvd % div == 0){
      int temp = dvd / div;
      dvd = temp;
      System.out.print(div + " ");
      }else{
         div++;
      }
  }
  
  System.out.println(div);
  
  
 }
}