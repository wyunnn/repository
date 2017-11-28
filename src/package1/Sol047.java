class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        Arrays.sort(nums);
        helper(res, tmp, nums, used);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> tmp, int[] nums, boolean[] used){
        if (tmp.size() == nums.length){
            res.add(new ArrayList<>(tmp));
            return;
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(i > 0 && nums[i] == nums[i-1] && used[i-1] == false)       continue;
                if(used[i] == false){
                    used[i] = true;
                    tmp.add(nums[i]);
                    helper(res, tmp, nums, used);
                    tmp.remove(tmp.size() - 1);
                    used[i] = false;
                }
            }
        }
    }
    
}
