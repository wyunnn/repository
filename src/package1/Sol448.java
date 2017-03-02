package package1;
import java.util.*;

public class Sol448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        Arrays.sort(nums);

        int n = 1;
        for(int i = 0; i < nums.length && n <= nums.length; ){
            if(nums[i] > n){
                ret.add(n);
                n++;
            }
            else{
                n = nums[i]+1;
                i++;
            }
        }
        while(n <= nums.length){
            ret.add(n);
            n++;
        }
        return ret;
    }
}