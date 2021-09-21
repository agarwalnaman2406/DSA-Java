import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n/2;
        for(int i=0;i<n;i++){
            if(i == (n/2)){
                for(int j=0;j<n/2;j++){
                    System.out.print("*	");
                }
            }else{
                for(int j=0;j<spaces;j++){
                    System.out.print("	");
                }
            }
            
            for(int j=0;j<stars;j++){
                System.out.print("*	");
            }
            
            if(i<n/2){
                stars++;
            }else{
                stars--;
            }
            
            System.out.println();
        }

    }
}