package package1;

public class Sol010 {
    public boolean isMatch(String s, String p) {
        return helper(s, 0, p, 0);
    }
    
    private boolean helper(String s, int p1, String p, int p2){
        if(p1 == s.length()) {
            if(p2 == p.length()){
                return true;
            }
            if(p.charAt(p2) == '*'){
                return helper(s, p1, p, p2+1);
            }
            if(p2+1 < p.length() && p.charAt(p2+1) == '*'){
                return helper(s, p1, p, p2+2);
            }
        }
        else if (p1 >= s.length() || p2 >= p.length()){
            return false;
        }
        else{
            if(p2+1 < p.length() && p.charAt(p2+1) == '*'){
                if(s.charAt(p1) == p.charAt(p2) || p.charAt(p2) == '.'){
                    return helper(s, p1+1, p, p2) || helper(s, p1+1, p, p2+2) || helper(s, p1, p, p2+2) ;
                }
                else{
                    return helper(s, p1, p, p2+2);
                }
            }
            else if(p.charAt(p2) == '.' || s.charAt(p1) == p.charAt(p2)){
                return helper(s, p1+1, p, p2+1);
            }
        }
        return false;
    }
}