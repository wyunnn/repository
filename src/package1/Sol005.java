package package1;

public class Sol005 {
    public String longestPalindrome(String s) {
        String ret = "";
        
        for(int i = 0; i < s.length(); i++){
            int j = i;
            int k = i; 
            while(k+1 < s.length()){
                if(s.charAt(i) != s.charAt(k+1))  break; 
                k++;
            }
            
            while(j-1 >=0 && k+1< s.length() && s.charAt(j-1) == s.charAt(k+1)){
                j--;
                k++;
            }
            
            ret = (k-j+1) > ret.length() ? s.substring(j, k+1) : ret;
            
        }
        return ret;
        
    }
}