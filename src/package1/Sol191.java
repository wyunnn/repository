package package1;

public class Sol191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0 ;
        if(n == 0){
            return count;
        }
        for(int i = 0 ; i < 32 ; i++){
            if((n & (1 << i)) != 0){
                count++;
            }
        }
        return count;
    }
}
