package package1;

public class Sol453 {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0; 
        
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
        }
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i] - min;
        }
        return sum;
    }
}