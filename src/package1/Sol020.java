package package1;

import java.util.*;

public class Sol020 {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{'){
                stack.push(a);
            }
            else if(stack.empty()){
                return false;
            }
            else {
                char b = stack.pop();
                if((b == '(' && a == ')') || (b =='[' && a ==']') || (b =='{' && a == '}'))  continue;
                else    return false;
            }
        }
        
        if(!stack.empty()){
            return false;
        }
        return true;
    }
}