package package1;

import java.util.Arrays;

public class Sol268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        int n = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == n)
                n++;
            else 
                break;
        }
        return n;
    }
}