package package1;

public class Sol265 {
    public int minCostII(int[][] costs) {
        if(costs.length == 0 || costs[0].length == 0)    return 0;
        
        int min1 = -1, min2 = -1;
        
        for(int i = 0; i < costs.length; i++){
            int last1 = min1, last2 = min2; 
            min1 = -1; min2 = -1;
            
            for(int j = 0; j < costs[0].length; j++){
                if(j != last1){
                    costs[i][j] += (last1 < 0 || i == 0) ? 0 : costs[i-1][last1];
                }
                else{
                    costs[i][j] += (last2 < 0 || i == 0) ? 0 : costs[i-1][last2];
                }
                
                            
                //get min1, min2
                if(min1 < 0 || costs[i][j] < costs[i][min1]){
                    min2 = min1; 
                    min1 = j;
                }
                else if(min2 < 0 || costs[i][j] < costs[i][min2]){
                    min2 = j;
                }
            }

        }
        
        return costs[costs.length-1][min1];
    }
}