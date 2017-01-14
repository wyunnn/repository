package package1;

import java.util.*;

public class Sol062 {
    public int uniquePaths(int m, int n) {
        int[][] sum = new int[m][n];
        Arrays.fill(sum[0], 1);
        
        for(int i = 1; i < m; i++){
            sum[i][0] = 1;
        }
        
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                sum[i][j] = sum[i-1][j]+sum[i][j-1];
            }
        }
        
        return sum[m-1][n-1];
    }
}