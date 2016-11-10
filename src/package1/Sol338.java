package package1;

public class Sol338 {
    public int[] countBits(int num) {
        int[] m = new int[num+1];
        m[0] = 0;
        
        for(int i = 1; i < num + 1; i++){
            m[i] = m[ i& (i-1) ]+1;
        }
        return m;
        
    }
}