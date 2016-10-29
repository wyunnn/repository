package package1;

public class Sol006 {
    public String convert(String s, int numRows) {
        int l = s.length();
        int rem = 0;
        int row = 1;
        
        String result = new String();
        int group = 2 * (numRows - 1);
        
        if (numRows >= l || numRows == 1) return s;
        
        for (int i = 0; i < l; i++){
            rem = i % group;
            if(rem == 0){
                result=result+s.charAt(i);
            }
        }
        
        while(row<numRows-1){
            for(int i =0; i<l; i++){
                rem = i % group;
                if(rem == row){
                    result = result + s.charAt(i);
                }
                else if(rem == (group-row)){
                    result = result + s.charAt(i);
                }
            }
            row++;
        }
        
        if (row == numRows-1){
            for(int i =0; i<l; i++){
                rem = i % group;
                if(rem == row){
                    result = result + s.charAt(i);
                } 
            }
        }
        return result;
        
    }
}
