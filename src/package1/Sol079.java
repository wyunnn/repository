package package1;

public class Sol079 {
    public boolean exist(char[][] board, String word) {
        int[][] visited = new int [board.length][board[0].length];
        boolean tmp = false;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                tmp = tmp || help(i, j, board, visited, word, 0);
            }
        }
        return tmp;
    }
    private boolean help(int i, int j, char[][] board, int[][] visited, String word, int k){

        if(i < 0 || j < 0 || i >= board.length || j >=board[0].length){
            return false;
        }
        if(visited[i][j] == 1){
            return false;
        }
        if(word.charAt(k) != board[i][j]){
            return false;
        }
        if(k == word.length() - 1 && word.charAt(k) == board[i][j]){
            return true;
        }
        
        else{
            visited[i][j] = 1;
            if(help(i+1, j, board, visited, word, k+1)
             || help(i, j+1, board, visited, word, k+1)
             || help(i-1, j, board, visited, word, k+1)
             || help(i, j-1, board, visited, word, k+1)){
                return true;
             }
            visited[i][j] = 0;
            return false;
    
        }
    }
}