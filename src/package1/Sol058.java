package package1;

public class Sol058 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean f = true; //first char of a word
        
        for (int i = 0; i< s.length(); i++){
            char a = s.charAt(i);
            if(a == ' '){
                f = true;
            }
            else if(f){
                count = 1;
                f = false;
            }
            else {
                count++;
            }
        }
        return count;
    }
}