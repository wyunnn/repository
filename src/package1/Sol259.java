package package1;

import java.util.*;

public class Sol259 {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            int left = i+1, right = nums.length -1;
            
            while(left < right){
                while(nums[i] + nums[left] + nums[right] >= target && right > left){
                    right--;
                }
                res += right - left; 
                left++;
            }
        }
        return res;
    }
}