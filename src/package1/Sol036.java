package package1;
import java.util.*;

public class Sol036 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> col = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            
            for(int j = 0; j < 9; j++){
                if (board[i][j] != '.' && !row.add(board[i][j])){
                    return false;
                }
                if (board[j][i] != '.' && !col.add(board[j][i])){
                    return false;
                }
                int cube_i = 3*(i/3)+j/3;
                int cube_j = 3*(i%3)+j%3;
                if (board[cube_i][cube_j] != '.' && !cube.add(board[cube_i][cube_j])){
                    System.out.println("i"+i+"j"+j);
                    return false;
                }
            }
        }
        return true;
    }
}