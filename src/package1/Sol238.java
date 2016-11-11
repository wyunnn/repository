package package1;

import java.util.*;

public class Sol238 {
	// O(n) time and O(1) space
    public int[] productExceptSelf(int[] nums) {
        int [] a = new int[nums.length];
        int [] b = new int[nums.length];
        
        Arrays.fill(a, 1);
        Arrays.fill(b, 1);

        
        for(int i = 1; i < nums.length; i++){
            a[i] = a[i-1]*nums[i-1];
        }
        
        int p = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            a[i] = a[i]*p;
            p = p*nums[i];
        }
        
        return a;
        
    }
	
	
/*
 *  With extra space O(n)
 *  O(n)
 *  
 * 	public int[] productExceptSelf(int[] nums) {
        int [] a = new int[nums.length];
        int [] b = new int[nums.length];
        
        Arrays.fill(a, 1);
        Arrays.fill(b, 1);

        
        for(int i = 1; i < nums.length; i++){
            a[i] = a[i-1]*nums[i-1];
        }
        
        for(int i = nums.length - 2; i >= 0; i--){
            b[i] = b[i+1]*nums[i+1];
        }
        
        for(int i = 0; i < nums.length; i++){
            a[i] = b[i]*a[i];
        }
        return a;
        
    }*/
	
	
	
/*
 *		O(n^2)
 *     
 *     public int[] productExceptSelf(int[] nums) {
        int [] a = new int[nums.length];
        Arrays.fill(a, 1);
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if (i != j)     a[i] *= nums[j];
            }
        }
        return a;
        
    }*/
}