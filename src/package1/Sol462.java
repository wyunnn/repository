package package1;

import java.util.*;

public class Sol462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums[nums.length / 2];
        int res = 0;
        
        for(int i = 0; i < nums.length; i++){
            res += (n - nums[i] > 0 ? n - nums[i] : nums[i] - n);
        }
        return res;
    }
}