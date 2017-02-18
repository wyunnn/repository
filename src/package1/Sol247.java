package package1;

import java.util.*;

public class Sol247 {
    public List<String> findStrobogrammatic(int n) {
        List<String> list = new ArrayList<String>();
        helper(list,"","", n, true);
        return list;
    }
    private void helper(List<String> list, String a, String b, int n, boolean first){
        if(n == 0){
            list.add(a+b);
            return;
        }
        if(n == 1){
            list.add(a+"1"+b);
            list.add(a+"0"+b);
            list.add(a+"8"+b);
            return;
        }
        else{
            helper(list, a+"8", "8"+b, n-2, false);
            helper(list, a+"1", "1"+b, n-2, false);
            helper(list, a+"6", "9"+b, n-2, false);
            helper(list, a+"9", "6"+b, n-2, false);
            if(!first)
                helper(list, a+"0", "0"+b, n-2, false);
        }
    }
}