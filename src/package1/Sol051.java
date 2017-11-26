class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        helper(res, new char[n][n], n, 0);
        return res;
    }
    
    public void helper(List<List<String>> res, char[][] tmp, int n, int row){
        if(row == n){
            List<String> templist = new ArrayList<>();
            for(int i = 0; i < tmp.length; i++){
                templist.add(new String(tmp[i]));
            }
            res.add(templist);
        }
        else{
            for(int j = 0; j < n; j++){
                tmp[row][j] = '.';
            }
            
            for(int j = 0; j < n; j++){
                if(isValid(tmp, row, j)){
                    tmp[row][j] = 'Q';
                    helper(res, tmp, n, row+1);
                    tmp[row][j] = '.';
                }
            }
        }
    }
    
    public boolean isValid(char[][] puzzle, int m, int n){
        for(int i = 0; i < puzzle.length; i++){
            for(int j = 0; j < puzzle[0].length; j++){
                if(puzzle[i][j]=='Q'){
                    if(i == m || j == n || i+j == m+n || i-j == m-n){
                        return false;
                    }   
                }
            }
        }
        return true;
    }
}
