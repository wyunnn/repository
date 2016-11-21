package package1;

public class Sol345 {
    public String reverseVowels(String s) {
        int i = 0; 
        int j = s.length()-1;
        
        char[] schar = s.toCharArray();
        
        while(i < j){
            while(i < j && !isVowel(schar[i])){
                i++;
            }  
            while(i < j && !isVowel(schar[j])){
                j--;
            }
            if(i < j){
                char tmp = schar[i];
                schar[i] = schar[j];
                schar[j] = tmp;
            }
            i++;
            j--;
        }
        
        return new String(schar);
    }
    public boolean isVowel(char a){
        if (a == 'a'|| a == 'e' || a == 'i' || a == 'o' || a == 'u'
        || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U')
            return true;
        else 
            return false;
    }
}