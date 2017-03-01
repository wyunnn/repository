package package1;

public class Sol485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, max = 0;
        
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                cnt++;
            }
            else{
                max = Math.max(max, cnt);
                cnt = 0;
            }
        }
        max = Math.max(max, cnt);
        return max;
    }
}