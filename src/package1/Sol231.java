package package1;

public class Sol231 {
    public boolean isPowerOfTwo(int n) {
        if(n==1)    return true;
        if(n==0)    return false;
        
        if(n%2 == 0)
            return isPowerOfTwo(n/2);
        else    
            return false;
        
    }
}