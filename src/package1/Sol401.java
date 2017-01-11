package package1;
import java.util.*;

//  not a good solution
public class Sol401 {
    final static int [] hh = new int[]{1,2,4,8};
    final static int [] mm = new int[]{1,2,4,8,16,32};
    
    public List<String> readBinaryWatch(int num) {
        List <String> ret = new ArrayList<String>();
        backtrack(ret, 0, 0, 0, 0, num);
        return ret;
    }

    public void backtrack(List<String> ret, int i, int j, int h, int m, int num){
        if(num < 0 || h > 11 || m > 59){
            return;
        }
        if(num == 0){
            ret.add(h+ (m<10 ? ":0" : ":")+m);
            return;
        }
        
        if(i < hh.length){
            backtrack(ret, i+1, j+1, h + hh[i], m, num - 1); 

        }
        if(j < mm.length){
            backtrack(ret, i+1, j+1, h, m + mm[j], num - 1);
        }
        if(i < hh.length && j < mm.length){
            backtrack(ret, i+1, j+1, h + hh[i], m + mm[j], num - 2); 
        }
        if(i < hh.length || j < mm.length){
            backtrack(ret, i+1, j+1, h, m, num); 
        }
    }
}