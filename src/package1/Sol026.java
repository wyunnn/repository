package package1;

public class Sol026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1)     return nums.length;
        
        int a = nums[0];
        int n = 1;
        for(int i = 1; i < nums.length; i++){
            if(a != nums[i]){
                a = nums[i];
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
}