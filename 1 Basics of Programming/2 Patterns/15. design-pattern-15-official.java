import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int space = n/2;
        int stars = 1;
        int count = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print("	");
            }
            int temp = count;
            for(int j=0;j<stars;j++){
                System.out.print(temp + "	");
                if(j<stars/2){
                    temp++;
                }else{
                    temp--;
                }
                
            }
            System.out.println();
            if(i<n/2){
                stars += 2;
                space -= 1;
                count++;
            }else{
                stars -= 2;
                space += 1;
                count--;
            }
        }

    }
}