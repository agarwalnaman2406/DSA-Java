import java.util.*;
  
  public class Main {
  
  	  public static void main(String[] args) {
  	  	  // TODO Auto-generated method stub
          Scanner scn= new Scanner(System.in);
          int n=scn.nextInt();
          int[][] costs= new int[n][3];
          for(int i=0;i<n;i++){
              for(int j=0;j<3;j++){
                  costs[i][j]=scn.nextInt();
              }
          }
           System.out.println(minCost(costs));
  	  }
  	  // -----------------------------------------------------
  	  // This is a functional problem. Only this function has to be written.
  	  // This function takes as input 2D array
  	  // It should return the required output
  
  	  public static int minCost(int[][] costs) {
  	  	  //Write your code here
          int incr = costs[0][0];
          int incb = costs[0][1];
          int incg = costs[0][2];
          
          for(int i=1;i<costs.length;i++){
              int nincr = costs[i][0] + Math.min(incb, incg);
              int nincb = costs[i][1] + Math.min(incr, incg);
              int nincg = costs[i][2] + Math.min(incr, incb);
              incr = nincr;
              incb = nincb;
              incg = nincg;
          }
          
          int ans = Math.min(incr, Math.min(incb, incg));
          return ans;
  	  }
  }