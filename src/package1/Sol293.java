package package1;
import java.util.*;

public class Sol293 {
    public List<String> generatePossibleNextMoves(String s) {
        char[] cs = s.toCharArray();
        List<String> ret = new ArrayList<String>();
        for(int i = 0; i <s.length() - 1; i++){
            if(cs[i] == cs[i+1]){
                if(cs[i] == '+'){
                    cs[i] = '-';
                    cs[i+1] = '-';
                    ret.add(new String(cs));
                    cs[i] = '+';
                    cs[i+1] = '+';
                }
            }
        }
        return ret;
    }
}