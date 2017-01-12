package package1;

public class Sol096 {
    public int numTrees(int n) {
        int [] ret = new int[n+1];
        ret[0] = 1;
        ret[1] = 1;
        
        for(int i = 2; i < n+1; i++){
            //ret[i] = ret[0]*ret[i-1] + ret[1]*ret[i-2] + ... + ret[i-1]*ret[0];
            for(int j = 0; j < i; j++){
                ret[i]+= ret[j]*ret[i-j-1];
            }
        }
        return ret[n];
    }
}