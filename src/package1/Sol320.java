package package1;

import java.util.*;

public class Sol320 {
    public List<String> generateAbbreviations(String word) {
        List<String> re = new ArrayList<String>();
        help(re, word, 0, 0, "");
        return re;
    }
    
    
    private void help(List<String> re, String word, int pos, int count, String tmp){      
        if(pos == word.length()){
            if(count > 0)   tmp+=count;
            re.add(tmp);
        }
        else{
            help(re, word, pos+1, count+1, tmp);
            help(re, word, pos+1, 0, tmp+(count > 0 ? count : "")+word.charAt(pos));
        }
    }
}