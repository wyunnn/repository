package package1;

public class Sol334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3)    return false;
        
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i ++){
            if (nums[i] <= min)             min = nums[i];
            else if(nums[i] <= secmin)      secmin = nums[i];
            else                            return true;
        }
        
        return false;
    }
}