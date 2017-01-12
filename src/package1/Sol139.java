package package1;

import java.util.*;

public class Sol139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean [] ret = new boolean[s.length()];
        
        for(int i = 0; i < wordDict.size(); i++){
            int j = wordDict.get(i).length();
            if(j <= s.length() && wordDict.get(i).equals(s.substring(0,j))){
                ret[j-1] = true;
            }
        }
        for(int i = 0; i < ret.length; i++){
            if(ret[i] == true){
                for(int j = 0; j < wordDict.size(); j++){
                    String cur = wordDict.get(j);
                    int l = cur.length();
                    if(i+l < ret.length && s.substring(i+1, i+l+1).equals(wordDict.get(j))){
                        ret[i+l] = true;
                    }
                }
            }
        }
        
        return ret[s.length()-1];
    }
}