package package1;

public class Sol418 {
	
	
	/*
	 * similar to the solution 1 in this blog
	 * http://www.cnblogs.com/grandyang/p/5975426.html
	 */
	public int wordsTyping(String[] sentence, int rows, int cols) {
        String all = "";
        int res = 0;
        
        for(int i = 0; i < sentence.length; i++){
            all += sentence[i] + ' ';
        }
        int len = all.length();
        
        for(int i = 0; i < rows; i++){
            res += cols;
            if(all.charAt(res%len) == ' '){
                res++;
            }
            else{
                while(res > 0 && all.charAt(res%len) != ' '){
                    res--;
                }
                res++;
            }
        }
        return res / len;
    }
	
    /*
     * TLE
     * 
     * public int wordsTyping(String[] sentence, int rows, int cols) {
        int rem = cols;
        int time = 0;
        
        while(rows > 0){
            for(int i = 0; i < sentence.length; i++){
                
                int l = sentence[i].length();
                
                if(l > cols)  return 0;
                else if(l <= rem){
                    rem = rem - l - 1;
                }
                else{ // l > rem
                    rows--;
                    if(rows == 0)       return time;
                    rem = cols - l - 1;
                }
            }
            time++;
        }
        
        return time;
    }*/
}