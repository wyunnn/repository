package package1;

public class Sol279 {
    public int numSquares(int n) {
        int [] res = new int [n+1];
        res[1] = 1;

        for(int i = 2; i < n+1; i++){
            res[i] = Integer.MAX_VALUE;
            for(int j = 1; j*j <= i; j++){
                res[i] = Math.min(res[i], 1+res[i - j*j]);
            }
        }
        
        return res[n];
    }
}