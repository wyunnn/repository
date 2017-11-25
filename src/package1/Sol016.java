class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE; 
        
        for(int i = 0; i < nums.length; i ++){
            int num1 = nums[i];
            int left = i+1, right = nums.length - 1;
            
            while(left < right){
                int diff = num1 + nums[left] + nums[right] - target;

                if(Math.abs(diff) < Math.abs(min)){
                    min = diff;
                }
                if(diff > 0){
                    right--;
                }
                else if( diff < 0){
                    left++;
                }
                else{
                    return target;
                }
            }
        }

        return min + target;
    }
}
