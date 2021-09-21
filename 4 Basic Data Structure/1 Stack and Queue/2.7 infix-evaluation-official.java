import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    evaluate(exp);
 }
 
 public static void evaluate(String str){
     
     Stack<Integer> st1 = new Stack<>(); // Operands
     Stack<Character> st2 = new Stack<>(); // Operator
     
     for(int i=0;i<str.length();i++){
         
         char ch = str.charAt(i);
         if(ch >= '0' && ch <= '9'){
             st1.push(ch-'0');
         }else if(ch == '('){
             st2.push(ch);
         }else if(ch == ')'){
             while(st2.peek() != '('){
                 char oprtr = st2.pop();
                 int opr2 = st1.pop();
                 int opr1 = st1.pop();
                 int ans = solve(opr1, opr2, oprtr);
                 System.out.println(oprtr + " " + opr1 + " " + opr2 +" "+ans);
                 st1.push(ans);
             }
             st2.pop();
         }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            while(st2.size() != 0 && precedence(st2.peek()) >= precedence(ch)){
                 char oprtr = st2.pop();
                 int opr2 = st1.pop();
                 int opr1 = st1.pop();
                 int ans = solve(opr1, opr2, oprtr);
                 System.out.println(oprtr + " " + opr1 + " " + opr2 +" "+ans);
                 st1.push(ans);
             }
             st2.push(ch);
         }
         
     }
     
     while(st2.size() != 0){
         char oprtr = st2.pop();
         int opr2 = st1.pop();
         int opr1 = st1.pop();
         int ans = solve(opr1, opr2, oprtr);
         System.out.println(oprtr + " " + opr1 + " " + opr2 +" "+ans);
         st1.push(ans);
     }
     
     System.out.println(st1.peek());
     
 }
 
 public static int solve(int op1, int op2, char oprtr){
     if(oprtr == '+'){
         return op1 + op2;
     }else if(oprtr == '-'){
         return op1 - op2;
     }else if(oprtr == '*'){
         return op1 * op2;
     }else{
         return op1 / op2;
     }
 }
 
 public static int precedence(char ch){
     if(ch == '+' || ch == '-'){
         return 1;
     }else if(ch == '*' || ch == '/'){
         return 2;
     }else{
         return 0;
     }
 }
 
}