class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        helper(res, tmp, candidates, 0, target);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> tmp, int[] nums, int cur, int target){
        if(target == 0){
            res.add(new ArrayList<>(tmp));
            return;
        }
        else if (target < 0){
            return;
        }
        else{
            for(int i = cur; i < nums.length; i++){
                tmp.add(nums[i]);
                helper(res, tmp, nums, i, target-nums[i]);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
