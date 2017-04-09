package package1;

import java.util.*;

public class Sol532 {
    public int findPairs(int[] nums, int k) {
        int p1 = 0, p2 = 1;
        int ret = 0;
        
        Arrays.sort(nums);        //sort
        
        while(p1 < nums.length  && p2 < nums.length){
            while(p2 < nums.length && nums[p2] < nums[p1] + k){
                p2++;
            }
            if(p2 < nums.length && nums[p2] == nums[p1] + k){
                ret++;
                while(p1 < nums.length && nums[p2] == nums[p1] + k){
                    p1++;
                }
                p2 = p1 + 1;
            }
            else{
                p1++;
                p2 = p1+1;
            }
        }
        
        return ret;
    }
}