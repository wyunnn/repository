class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int lo = i+1, hi = nums.length - 1;
            
            while(lo < hi){
                if(nums[i] + nums[lo] + nums[hi] == 0){
                    ret.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                    while(lo < hi && nums[lo] == nums[lo-1]){
                        lo++;
                    }
                    while(lo < hi && nums[hi]==nums[hi+1]){
                        hi--;
                    }
                }
                
                else if(nums[i] + nums[lo] + nums[hi] > 0){
                    hi--;
                }
                else{
                    lo++;
                }
            }
        }
        return ret;
    }
}
