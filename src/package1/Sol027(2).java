class Solution {
    public int removeElement(int[] nums, int val) {
        int start = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                start++;
                swap(nums, start, i);
            }
        }
        return start + 1;
        
    }
    public void swap(int[] nums, int n1, int n2){
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }
}
