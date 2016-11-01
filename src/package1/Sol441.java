package package1;

public class Sol441 {
    public int arrangeCoins(int n) {
        int m = (int) Math.sqrt((long)2*n); //n is within 32-bit
        
        if(2*n >= (1+m)*m){
            return m;
        }
        else
            return m-1;
    }
}