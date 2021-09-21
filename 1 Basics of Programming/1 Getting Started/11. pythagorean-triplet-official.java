import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here
    Scanner scan = new Scanner(System.in);
    
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int max = a;
    
    if(b >= max){
        max = b;
    }
    
    if(c >= max){
        max = c;
    }
    
    if(max == a){
        if((a * a) == (b * b) + (c * c)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }else if(max == b){
        if((b * b) == (a * a) + (c * c)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }else if(max == c){
        if((c * c) == (b * b) + (a * a)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
    
   }
  }