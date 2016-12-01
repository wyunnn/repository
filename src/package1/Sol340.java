package package1;

import java.util.*;

/*
 * This is a sliding window problem. I did two things stupid: 
 * (1) misunderstand the question (did not read carefully)
 * (2) debug by modifying the original code but didn't replace
 *  all the variant needed...which caused more problems
 * 
 */

public class Sol340 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int left = 0;
        int res = 0;
        
        if(k == 0)      return 0;
        
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            
            if(map.size() > k){
                while(map.size() > k){
                    if(map.get(s.charAt(left)) == 1){
                        map.remove(s.charAt(left));
                    }
                    else{
                        map.put(s.charAt(left), map.get(s.charAt(left))-1);
                    }
                    left++;
                }
            }
            
            res = Math.max(res, i - left + 1);

        }
        return res;
    }
}