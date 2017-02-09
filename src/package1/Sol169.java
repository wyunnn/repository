package package1;

public class Sol169 {
    public int majorityElement(int[] nums) {
        //brute force: o(n2) - TLE
/*        int c = nums.length/2;
        int count;
        int r = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            count = 0;
            for(int j = 0; j< nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
                if(count > c)   return nums[i];
            }
        }
        
        return r;*/
        
        //Boyer–Moore majority vote algorithm
        int maj = nums[0];
        int count = 0;
        for(int i : nums){
            if(count == 0){
                maj = i;
                count = 1;
            }
            else if(i == maj){
                count++;
            }
            else{
                count--;
            }
        }
        return maj;
        
    }
    
    
}