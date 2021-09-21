import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int ospaces = n/2;
        int ispaces = -1;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<ospaces;j++){
                System.out.print("	");
            }
            System.out.print("*	");
            for(int j=0;j<ispaces;j++){
                System.out.print("	");
            }
            
            if(i>0 && i<n-1){
                System.out.print("*	");
            }
            
            if(i<n/2){
                ospaces--;
                ispaces += 2;
            }else{
                ospaces++;
                ispaces -=2;
            }
            System.out.println("");
        }

    }
}