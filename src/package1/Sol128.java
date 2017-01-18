package package1;

import java.util.*;

public class Sol128 {
    public int longestConsecutive(int[] nums) {
    	int max = 0;
    
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < nums.length; i++){
    		int v = 1;
    		
    		if(map.containsKey(nums[i])){
    		    continue;
    		}

    		if(map.containsKey(nums[i]-1) || map.containsKey(nums[i]+1)){
    		    int left = 0, right = 0;
    			if(map.containsKey(nums[i]-1)){
    				left += map.get(nums[i]-1);
    			}
    			if(map.containsKey(nums[i]+1)){
    				right += map.get(nums[i]+1);
    			}
    			v += left+right;
    			map.put(nums[i]-left, v);
    			map.put(nums[i]+right, v);
    		}
    		map.put(nums[i],v);
    		max = Math.max(v, max);
    	}
    	return max;
    }
}