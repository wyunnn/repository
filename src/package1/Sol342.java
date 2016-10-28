package package1;

public class Sol342 {
    public boolean isPowerOfFour(int num) {
        if(num == 0) return false;
        double numb = (double)num;
        
        while(numb >=1) {
            if (numb == 1) return true;
            else numb = numb/4;
        }
        return false;
    }
}