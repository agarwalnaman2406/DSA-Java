import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1){
                    System.out.print("*	");
                }else if(i>=n/2 && (i == j || i+j == n-1)){
                    System.out.print("*	");
                }else{
                    System.out.print("	");
                }
            }
            System.out.println("");
        }

    }
}