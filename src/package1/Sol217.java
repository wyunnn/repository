package package1;

import java.util.*;

public class Sol217 {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> mySet = new HashSet<Integer>();
         for(int i = 0; i< nums.length; i++){
             if (mySet.contains(nums[i])){
                 return true;
             }
             mySet.add(nums[i]);
         }
         return false;
    }
}