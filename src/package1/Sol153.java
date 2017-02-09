package package1;
import java.util.*;

public class Sol153 {
    public int findMin(int[] nums) {
        int mid = nums[nums.length/2];
        if(nums[0] < nums[nums.length-1]){
            return nums[0];
        }
        else if(nums.length <= 2){
            return nums[nums.length-1];
        }
        else if(mid > nums[0]){
            return findMin(Arrays.copyOfRange(nums, nums.length/2, nums.length));
        }
        else{
            return findMin(Arrays.copyOfRange(nums, 0, nums.length/2+1));
        }
    }
}