package package1;
import java.util.*;

public class Sol159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int p1 = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(map.containsKey(cur)){
                map.put(cur, map.get(cur)+1);
            }
            else{
                map.put(cur, 1);
            }
            
            while(map.size() > 2){
                if(map.get(s.charAt(p1)) > 1){
                    map.put(s.charAt(p1), map.get(s.charAt(p1)) - 1);
                }
                else{
                    map.remove(s.charAt(p1));
                }
                p1++;
            }
            max = Math.max(max, i-p1+1);
        }
        return max;
    }
}