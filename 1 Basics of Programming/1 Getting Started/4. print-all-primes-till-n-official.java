import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int n=low;n<=high;n++){
            int count = 0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    count++;
                    break;
                }
            }
            
            if(count == 0){
                System.out.println(n);
            }
        }
    }
}