package package1;

public class Sol202 {
    public boolean isHappy(int n) {
        
        int slow = n, fast = n;
        do{
            slow = sumSquares(slow);
            fast = sumSquares(sumSquares(fast));
        }while(slow != fast);
        
        if(slow == 1)           return true;
        else                    return false;
    }
    
    public int sumSquares(int n){
        int tmp = 0;
        while(n != 0){
            tmp += (n % 10)*(n % 10);
            n = n/10;
        }
        return tmp;
    }
}