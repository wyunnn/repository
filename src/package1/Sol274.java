package package1;

import java.util.Arrays;

public class Sol274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int count = citations.length;
        for(int i = 0; i < citations.length; i++){
            if(citations[i] >= count){
                return count;
            }
            count--;
        }
        return 0;
    }
}