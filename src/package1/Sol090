class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, tmp, nums, 0);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> tmp, int [] nums, int cur){
        res.add(new ArrayList<>(tmp));
        for(int i = cur; i < nums.length; i++){
            if(i > cur && nums[i] == nums[i-1]) continue;
            tmp.add(nums[i]);
            helper(res, tmp, nums, i+1);
            tmp.remove(tmp.size()-1);
        }
    }
} 
