package package1;

public class Sol283 {
    public void moveZeroes(int[] nums) {
        int ind = 0;
        int n = nums.length;
        
        for (int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                continue;
            }
            else{
                nums[ind] = nums[i];
                if(ind != i)  nums[i] = 0;
                ind++;
            }
        }
        return;
    }
}