package package1;

import java.util.*;

public class Sol238 {
    public int[] productExceptSelf(int[] nums) {
        int [] a = new int[nums.length];
        Arrays.fill(a, 1);
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if (i != j)     a[i] *= nums[j];
            }
        }
        return a;
        
    }
}