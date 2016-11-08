package package1;

public class Sol009 {
    public boolean isPalindrome(int x) {
        int right, left;
        int dl = 1;
        int dr = 1;
        
        if(x<0)    return false;
        
        while(x/dl >= 10){
            dl*=10;
        }
        
        do {
            right = (x / dr) % 10;
            left = (x / dl) % 10;
            dl = dl/10;
            dr = dr*10;
        
        } while(right == left && dl / dr >= 10);
        
        if(left == right)   return true;
        else                return false;

    }
}