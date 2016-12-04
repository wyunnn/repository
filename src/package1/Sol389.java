package package1;

import java.util.*;

public class Sol389 {
    public char findTheDifference(String s, String t) {
    	// It's faster to use bit manipulation...
    	
        HashMap<Character, Integer> a = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            if(a.containsKey(key)){
                a.put(key, a.get(key)+1);
            }
            else{
                a.put(key, 1);
            }
        }
        
        for(int i = 0; i < t.length(); i++){
            char key = t.charAt(i);
            
            if(a.get(key) == null){
                return key;
            }
            
            int value = a.get(key);
            if(value == 0){
                return key;
            }
            else{
                a.put(key, --value);
            }
        }
        
        return 0;
    }
}