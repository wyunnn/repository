package package1;

public class Sol357 {
    public int countNumbersWithUniqueDigits(int n) {
        int[] f = new int[n+1];
        int m;
        f[0] = 1;
        if(n > 0){
            f[1] = 10;
        }        
        
        for(int i = 2; i <= n; i++){
            m = 9;
            for (int j = 1; j < i; j++){
                m = m * (10 - j);
            }
            f[i] = f[i-1] + m;
        }
        return f[n];
    }
}