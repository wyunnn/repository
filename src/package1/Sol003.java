package package1;

public class Sol003 {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int [] map = new int [256];  
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            map[s.charAt(i)]++;
            while(map[s.charAt(i)] > 1){
                map[s.charAt(start)]--;
                start++;
            }
            if(i - start + 1 > max){
                max = i - start + 1;
            }
        }
        return max;
    }
}