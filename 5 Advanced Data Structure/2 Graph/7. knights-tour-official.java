import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = scan.nextInt();
        int col = scan.nextInt();
        printKnightsTour(new int[n][n], row, col, 1);
    }

    public static void printKnightsTour(int[][] chess, int row, int col, int upcomingMove) {
        
        if(row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] != 0){
            return;
        }
        
        if(upcomingMove == chess.length * chess.length){
            chess[row][col] = upcomingMove;
            displayBoard(chess);
            chess[row][col] = 0;
            return;
        }
        
        chess[row][col] = upcomingMove;
        printKnightsTour(chess, row-2, col+1, upcomingMove+1);
        printKnightsTour(chess, row-1, col+2, upcomingMove+1);
        printKnightsTour(chess, row+1, col+2, upcomingMove+1);
        printKnightsTour(chess, row+2, col+1, upcomingMove+1);
        printKnightsTour(chess, row+2, col-1, upcomingMove+1);
        printKnightsTour(chess, row+1, col-2, upcomingMove+1);
        printKnightsTour(chess, row-1, col-2, upcomingMove+1);
        printKnightsTour(chess, row-2, col-1, upcomingMove+1);
        chess[row][col] = 0;
        
        return;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}