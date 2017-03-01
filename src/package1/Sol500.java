package package1;

import java.util.*;

public class Sol500 {
    public String[] findWords(String[] words) {
        String[] c = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length(); j++){
                map.put(c[i].charAt(j), i);
            }
        }
        
        List<String> ret = new ArrayList<String>();
        
        for(int i = 0; i < words.length; i++){
            int v = 0;
            if(words[i].length() == 1){
                ret.add(words[i]);
                continue;
            }
            else if(words[i].length() > 0){
                char x = words[i].toLowerCase().charAt(0);
                v = map.get(x);
            }
            for(int j = 1; j < words[i].length(); j++){
                if(v != map.get(words[i].toLowerCase().charAt(j))){
                    break;
                }
                if(j == words[i].length() - 1){
                    ret.add(words[i]);
                }
            }
        }
        return ret.toArray(new String[ret.size()]);
    }
}