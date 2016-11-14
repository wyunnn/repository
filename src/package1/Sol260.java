package package1;

public class Sol260 {
    public int[] singleNumber(int[] nums) {
        int xor = 0, g1 = 0, g2 = 0;
        
        for(int i = 0; i < nums.length; i++){
            xor ^=nums[i];
        }
        
        int lastbit = xor - (xor & (xor -1));
        for(int i = 0; i < nums.length; i ++){
            if((lastbit & nums[i]) == 0){
                g1 ^= nums[i];
            }
            else {
                g2 ^= nums[i];
            }
        }
        return new int[] {g1, g2};
    }
}