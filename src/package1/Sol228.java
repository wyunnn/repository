package package1;

import java.util.*;

public class Sol228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> sol = new ArrayList<String>();
        if(nums.length == 0)    return sol;
        int start = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length - 1){
                if(start == nums[i])
                    sol.add(Integer.toString(start));
                else
                    sol.add(start + "->" + nums[i]);
            }
            
            
            else if(nums[i+1] - nums[i] != 1){
                if(start == nums[i])
                    sol.add(Integer.toString(start));
                else
                    sol.add(start + "->" + nums[i]);
                start = nums[i+1];
            }
        }
        
        return sol;
    }
}