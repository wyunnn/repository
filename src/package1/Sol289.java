package package1;

public class Sol289 {
    public void gameOfLife(int[][] board) {
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                int nei = countNeighbors(board, i, j);
                if(nei <=3 && nei >=2 && board[i][j] == 1){
                    board[i][j] = 3;
                }
                else if (nei == 3 && board[i][j] == 0){
                    board[i][j] = 2;
                }
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = (board[i][j] >> 1);
            }
        }
    }
    
    private int countNeighbors(int[][] board, int i, int j){
        int ret = 0;
        for(int m = Math.max(i-1,0); m <= Math.min(board.length-1, i+1); m++){
            for(int n = Math.max(j-1,0); n <= Math.min(board[0].length-1, j+1); n++){
                ret += (board[m][n] & 1);
            }
        }
        ret -= board[i][j] & 1;
        return ret;
    }
}