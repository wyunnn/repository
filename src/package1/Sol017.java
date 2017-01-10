package package1;
import java.util.*;

public class Sol017 {
    public List<String> letterCombinations(String digits) {
        
        String[] digit_letter = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ret = new ArrayList<String>();
        
        if(digits.length() == 0)    return ret;
        backtrack(ret, digit_letter, digits, 0, "");
        return ret;
    }
    
    private void backtrack(List<String> ret, String[] digit_letter, String digits, int pos, String tmp){
        
        if(pos==digits.length()){
            ret.add(tmp);
        }
        else{
            int dig_pos = Character.getNumericValue(digits.charAt(pos))-2;
            String dig_let = digit_letter[dig_pos]; //"abc"
            
            for(int i = 0; i < dig_let.length(); i++){
                backtrack(ret, digit_letter, digits, pos+1, tmp+dig_let.charAt(i));
            }
        }
    }
}