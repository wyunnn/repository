package package1;

public class Sol027 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        int l = nums.length;
        
        for(; i<l; i++){
            if(nums[i] == val){
                continue;
            }
            nums[j] = nums[i];
            j++;
        }
        return j;
    }
}