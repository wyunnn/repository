package package1;

public class Sol200 {
    public int numIslands(char[][] grid) {
        int nums = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    nums++;
                    search(i,j,grid);
                }   
            }
        }
        return nums;
    }
    
    public void search(int i, int j, char[][] grid){
        grid[i][j]= '0';
        if(i-1>=0 && grid[i-1][j] == '1'){
            grid[i-1][j] = '0';
            search(i-1, j, grid);
        }
        if(i+1< grid.length && grid[i+1][j] == '1'){
            grid[i+1][j] = '0';
            search(i+1, j, grid);
        }
        if(j-1>=0 && grid[i][j-1] == '1'){
            grid[i][j-1] = '0';
            search(i, j-1, grid);
        }
        if(j+1 < grid[0].length && grid[i][j+1] == '1'){
            grid[i][j+1] = '0';
            search(i, j+1, grid);
        }
        return;
    }
}