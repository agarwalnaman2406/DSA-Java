import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int stars = 1;
        int n = scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-stars;j++){
                System.out.print("	");
            }
            for(int j=0;j<stars;j++){
                System.out.print("*	");
            }
            System.out.println("");
            stars++;
        }

    }
}