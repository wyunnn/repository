package package1;
import java.util.*;

public class Sol442 {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        List<Integer> ret = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                ret.add(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        return ret;
    }
}