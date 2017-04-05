package package1;

public class Sol495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0, last = -1;
        
        for(int i = 0; i < timeSeries.length; i++){
            int t = timeSeries[i];
            if(t > last){
                total += duration;
            }
            else{
                total += duration - (last - t + 1);
            }
            
            last = t + duration - 1;
            
        }
        return total;
    }
}