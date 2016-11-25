package package1;

public class Sol392 {
    public boolean isSubsequence(String s, String t) {
        int pointer1 = 0;
        int pointer2 = 0;
        int len1 = s.length();
        int len2 = t.length();
        
        while(pointer1 < len1 && pointer2 < len2){
            if(s.charAt(pointer1) == t.charAt(pointer2)){
                pointer1++;
                pointer2++;
            }
            else{
                pointer2++;
            }
        }
        
        if(pointer1 == len1)
            return true;
        else 
            return false;
        
    }
}