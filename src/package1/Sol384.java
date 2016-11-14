package package1;
import java.util.*;

public class Sol384 {
    int [] res;
    int [] nums;
    Random r;

    public Sol384(int[] nums) {
        this.res = nums.clone();
        this.nums = nums;
        this.r = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        nums = res.clone();
        r = new Random();
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int m, tmp;
        for(int i = 0; i < res.length; i++){
            m =  r.nextInt(i+1);
            tmp = nums[i];
            nums[i] = nums[m];
            nums[m] = tmp;
        }
        return nums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */