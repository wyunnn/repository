package package1;

import java.util.*;

public class Sol120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int [] dp= new int[triangle.size()+1];
        
        for(int i = triangle.size(); i>0 ; i--){
            for(int j = 0; j < i; j++){
                dp[j] = triangle.get(i-1).get(j)+Math.min(dp[j], dp[j+1]);
            }
        }
        return dp[0];
    }
}