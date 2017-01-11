package package1;
import java.util.*;

public class Sol046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        backtrack(ret, nums, tmp);

        return ret;
    }
    private void backtrack(List<List<Integer>>ret, int[] nums, List<Integer> tmp){
        if(tmp.size() == nums.length){
            ret.add(new ArrayList<Integer>(tmp));
        }
        else{
            for(int j = 0; j < nums.length; j++){
                if(tmp.contains(nums[j]))
                    continue;
                tmp.add(nums[j]);
                backtrack(ret, nums, tmp);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}