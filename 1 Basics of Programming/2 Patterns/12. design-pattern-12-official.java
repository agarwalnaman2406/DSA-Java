import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int fn = 0;
        int sn = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(fn + "	");
                int temp = fn + sn;
                fn = sn;
                sn = temp;
            }
            System.out.println();
        }

    }
}