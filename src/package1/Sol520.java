package package1;

public class Sol520 {
    public boolean detectCapitalUse(String word) {
        
        boolean first = Character.isUpperCase(word.charAt(0));
        boolean second = word.length() > 1 ? Character.isUpperCase(word.charAt(1)) : false;
        
        if(first == false && second == true){
            return false;
        }
        
        for(int i = 2; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i)) != second){
                return false;    
            }
        }
        
        return true;
        
    }
}