package package1;

import java.util.*;


// turn int to long to avoid some edge problems
public class Sol163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        ArrayList<String> res = new ArrayList<String>();
        long next = lower;
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] < next){
                continue;
            }
            if(nums[i] > upper){
                res.add(getRange(next, upper));
                break;
            }
            if(nums[i] == next){
                next++;
            }
            else if (nums[i] > next){
                res.add(getRange(next, nums[i]-1));
                next = (long)nums[i]+1;
            }
        }
        
        if(next <= upper){
            res.add(getRange(next, upper));
        }
        return res;
    }
    
    private String getRange(long i, long j){
        return i == j ? ""+i : i+"->"+j;
    }
}