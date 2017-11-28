class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    for(int k = 1; k<=9; k++){
                        if(isValid(board, i, j, (char)(k+'0'))){
                            board[i][j] = (char)(k+'0');
                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isValid(char[][] board, int m, int n, char num){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(i == m || j == n){
                    if(board[i][j] == num){
                        return false;
                    }
                }
                if(i/3 == m/3 && j/3 == n/3){
                    if(board[i][j] == num){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
