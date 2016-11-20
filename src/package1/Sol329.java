package package1;

public class Sol329 {
    public int longestIncreasingPath(int[][] matrix) {
        int length = 0;
        if(matrix.length == 0)  return 0;
        
        int search [][] = new int [matrix.length][matrix[0].length];
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                int k = searchPath(i, j, matrix, search);
                search [i][j] = k;
                length = Math.max(k, length);
            }
        }
        return length;
    }
    
    public int searchPath(int i, int j, int[][]matrix, int[][]search){
        int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
        int l1 = 0, l2 = 0, l3 = 0, l4 = 0;
        
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length )     return 0;
        
        if(i+1 < matrix.length)
            x1 = matrix[i+1][j] - matrix[i][j];
        if(i-1 >= 0)
            x2 = matrix[i-1][j] - matrix[i][j];
        if(j+1 < matrix[0].length)
            x3 = matrix[i][j+1] - matrix[i][j];
        if(j-1 >= 0)
            x4 = matrix[i][j-1] - matrix[i][j];
            
        if (x1 > 0){
            if(search[i+1][j] > 0)
                l1 = search[i+1][j]+1;
            else
                l1 = searchPath (i+1, j, matrix, search) + 1;
        }
        if (x2 > 0){
            if(search[i-1][j] > 0)
                l2 = search[i-1][j]+1;
            else
                l2 = searchPath (i-1, j, matrix, search) + 1;
        }
        if (x3 > 0){
            if(search[i][j+1] > 0)
                l3 = search[i][j+1]+1;
            else
                l3 = searchPath (i, j+1, matrix, search) + 1;
        }
        if (x4 > 0){
            if(search[i][j-1] > 0)
                l4 = search[i][j-1]+1;
            else
                l4 = searchPath (i, j-1, matrix, search) + 1;
        }
        search[i][j] = Math.max(Math.max(Math.max(Math.max(l1,l2),l3),l4),1);
        return search[i][j];
        
    }
    
}