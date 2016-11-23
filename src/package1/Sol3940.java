package package1;

import java.util.*;

/*public class Sol3940 {
    public String decodeString(String s) {
        
        Stack<String> ss = new Stack<String>();
        Stack<Integer> si = new Stack<Integer>();
        int n = 0; 
        int num = 0;
        String tmp = "";
        String part = "";
        for(char a : s.toCharArray()){
            if(a >= '0' && a <= '9'){
                num = num *10 + (a - '0');
            }
            else if (a == '['){
                si.push(num);
                num = 0;
                ss.push(tmp);
                tmp = "";
            }
            else if(a != '[' && a != ']'){
                tmp = tmp + a; 
            }
            else if (a == ']'){
                if(si.size() >0){
                    n = si.pop();
                }
                
                part = "";
                if(tmp.equals("")){
                    tmp = ss.pop();
                }
                while(n > 0){
                    part = part + tmp;
                    n--;
                }
                
                if(ss.size() > 0){
                    tmp = ss.pop() + part;
                }
            }
        }
        return tmp;
    }
}*/

//-----Modified Version-----
public class Sol3940 {
    public String decodeString(String s) {
        Stack<String> ss = new Stack<String>();
        Stack<Integer> si = new Stack<Integer>();
        int n = 0; 
        int num = 0;
        String tmp = "";
        String part = "";
        for(char a : s.toCharArray()){
            if(a >= '0' && a <= '9'){
                num = num *10 + (a - '0');
            }
            else if (a == '['){
                si.push(num);
                num = 0;
                ss.push(tmp);
                tmp = "";
            }
            else if(a != '[' && a != ']'){
                tmp = tmp + a; //get the letters inside 
            }
            else if (a == ']'){
                n = si.pop();
                part = "";
                while(n > 0){
                    part = part + tmp;
                    n--;
                }
                if(ss.size() > 0){
                    tmp = ss.pop() + part;
                }
            }
        }
        return tmp;
    }
}
