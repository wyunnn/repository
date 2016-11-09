package package1;

public class Sol014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)    return "";
        
        int i,j;
        int ind = strs[0].length();

        for( i = 1; i < strs.length; i++){
            for(j = 0; j < strs[i].length() && j < strs[0].length(); j++){
                if(strs[0].charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            if (j < ind)		ind = j;
        } 
        return strs[0].substring(0, ind);
    }
}