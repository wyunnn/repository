package package1;

public class Sol245 {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int p1 = -1, p2 = -1;
        int res = Integer.MAX_VALUE;
        
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                p1 = i;
                if(word1.equals(word2)){
                    p1 = p2;
                    p2 = i;
                }
            }
            else if(words[i].equals(word2)){
                p2 = i;
            }
            if(p1 != -1 && p2 != -1){
                res = Math.min( Math.abs(p2-p1), res);
            }
        }
        return res;
    }
}