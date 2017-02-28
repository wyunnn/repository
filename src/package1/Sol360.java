package package1;

public class Sol360 {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {

        int [] ret = new int[nums.length];
        int m = 0, n = nums.length-1, p;
        
        if(a < 0)           p = 0;
        else                p = nums.length - 1;
        
        while(m <= n){
            int i = getNum(nums[m], a, b, c);
            int j = getNum(nums[n], a, b, c);
            if(a < 0){
                if(i < j){
                    ret[p] = i;
                    p++;
                    m++;
                }
                else{
                    ret[p] = j;
                    p++;
                    n--;
                }
            }
            else{
                if(i < j){
                    ret[p] = j;
                    p--;
                    n--;
                }
                else{
                    ret[p] = i;
                    p--;
                    m++;
                }
            }
        }
        return ret;
    }
    
    int getNum(int x, int a, int b, int c){
        return a*x*x+b*x+c;
    }
}