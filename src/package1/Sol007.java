package package1;

public class Sol007 {
    public int reverse(int x) {
        long r = 0;
        
        while (x!=0){
            r = 10*r+x%10;
            x = x/10;
        }
        if(r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) return 0;
        
        return (int)r;
    }
}