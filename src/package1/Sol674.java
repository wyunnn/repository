class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ret = nums.length > 0 ? 1 : 0;
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                max++;
            }
            else{
                max = 1;
            }
            if(max > ret)
                ret = max;
        }
        return ret;
    }
}
