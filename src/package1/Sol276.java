package package1;

public class Sol276 {
    public int numWays(int n, int k) {
        if(n == 0 || (n > 2 && k ==1))  return 0;
        if(n == 1)  return k;
        if(n == 2)  return k*k;
        
        int f1 = k;
        int f2 = k*k;
        
        for(int i = 3; i <= n; i++){
            int tmp = (k-1)*(f1+f2);
            f1 = f2;
            f2 = tmp;
        }
        return f2;
    }
}