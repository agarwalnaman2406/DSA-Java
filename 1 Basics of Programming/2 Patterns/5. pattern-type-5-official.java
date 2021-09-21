import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nstars = 1;
        int nspaces = n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<nspaces;j++){
                System.out.print("	");
            }
            for(int j=0;j<nstars;j++){
                System.out.print("*	");
            }
            System.out.println("	");
            if(i < n/2){
                nstars = nstars + 2;
                nspaces--;
            }else{
                nstars = nstars - 2;
                nspaces++;
            }
        }

    }
}