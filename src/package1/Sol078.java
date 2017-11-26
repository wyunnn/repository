class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        helper(res, tmp, nums, 0);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> tmp, int [] nums, int cur){
        res.add(new ArrayList<Integer>(tmp));
        for(int i = cur; i < nums.length; i++){
            tmp.add(nums[i]);
            helper(res, tmp, nums, i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
