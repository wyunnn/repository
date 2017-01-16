package package1;
import java.util.*;

public class Sol409 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> a = new HashMap<Character, Integer>();
        int ret = 0;
        for(int i = 0; i < s.length(); i++){
            if(a.containsKey(s.charAt(i))){
                a.remove(s.charAt(i));
                ret+=2;
            }
            else{
                a.put(s.charAt(i),1);
            }
        }
        if(ret==s.length() || s.length() ==0)   return ret;
        else                                    return ret+1;
    }
}