package package1;

public class Sol418 {
	
	
	
	
	
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