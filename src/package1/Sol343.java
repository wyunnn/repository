package package1;

public class Sol343 {
    public int integerBreak(int n) {
        int m;

        int k = n%3;
        int j = n/3;
        
        if(n==2 || n == 3)    return (n-1);
        
        if (k ==1)  
            m = (int)Math.pow(3,(j-1))*4;
        else if(k==2)
            m = (int)Math.pow(3,j)*2;
        else   
            m = (int) Math.pow(3,j);
        
        return m;
    }
}