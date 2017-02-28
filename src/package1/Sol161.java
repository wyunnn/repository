package package1;

public class Sol161 {
	
	
    public boolean isOneEditDistance(String s, String t) {
        
        int i = 0, j = 0, count = 0;
        int m = s.length(), n = t.length();
        
        while(i < m && j < n){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else if(s.substring(i+1).equals(t.substring(j)) || t.substring(j+1).equals(s.substring(i)) 
                    || s.substring(i+1).equals(t.substring(j+1))){
                return true;
            }
            else{
                return false;
            }
        }
        
        if((i == m && j == n-1) || (i == m-1 && j == n))
            return true;
        else
            return false;
        
    }	
	
	
/*  
 *  Time limit Exceeded (can be accepted - very slow)
 * 
 *   public boolean isOneEditDistance(String s, String t) {
        
        if (s.length() == 0 || t.length() == 0){
            if(Math.abs(s.length() - t.length()) == 1)
                return true;
            else
                return false;
        }
        else if(s.charAt(0) == t.charAt(0)){
            return isOneEditDistance(s.substring(1), t.substring(1));
        }
        else{
            return s.equals(t.substring(1)) || t.equals(s.substring(1)) || s.substring(1).equals(t.substring(1));
        }
    }*/
}