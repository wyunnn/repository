package package1;

import java.util.*;

public class Sol266 {
    public boolean canPermutePalindrome(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        
        for(int i = 0; i < s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        if(hs.size() > 1){
            return false;
        }
        else
            return true;
    }
}