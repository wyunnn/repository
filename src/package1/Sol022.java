package package1;

import java.util.*;

public class Sol022 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backtrack(res, n, 0, 0, "");
        return res;
        
    }
    private void backtrack(List<String> res, int n, int left, int right, String tmp){
        if(left == n && right == n){
            res.add(tmp);
        }
        else if(left == n) {// right !=n
            backtrack(res, n, left, right+1, tmp+")");
        }
        else{//left != n
            if(left > right){
                backtrack(res, n, left, right+1, tmp+")");
                backtrack(res, n, left+1, right, tmp+"(");
            }
            else{
                backtrack(res, n, left+1, right, tmp+"(");
            }
        }
    }
}