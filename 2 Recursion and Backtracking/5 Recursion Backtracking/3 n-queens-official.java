import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printNQueens(new int[n][n], "", 0);
        
    }
    
    public static boolean isSafe(int[][] chess, int row, int col){
        
        for(int i=row-1;i>=0;i--){
            if(chess[i][col] == 1){
                return false;
            }
        }
        
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        return true;
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        
        if(row == chess.length){
            System.out.println(qsf + ".");
            return;
        }
        
        for(int i=0;i<chess.length;i++){
            
            if(isSafe(chess, row, i)){
                chess[row][i] = 1;
                printNQueens(chess, qsf + row + "-" + i + ", ", row + 1);
                chess[row][i] = 0;
            }
            
        }
        
    }
}