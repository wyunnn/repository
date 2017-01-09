package package1;

//Not optimized solution
public class Sol275 {
    public int hIndex(int[] citations) {
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