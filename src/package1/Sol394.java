package package1;
import java.util.*;

public class Sol394 {
    public String decodeString(String s) {
        String res="";
        Stack<Integer> counts=new Stack<>();
        Stack<String> strs=new Stack<>();
        int i=0;
        
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                int num=0;
                while(Character.isDigit(s.charAt(i))){
                    num=num*10+(s.charAt(i)-'0');
                    i++;
                }
                counts.push(num);
                strs.push(res); // for each '[' 
                res="";
                i++;
            }
            else if(s.charAt(i)==']'){ // for each ']'
                StringBuilder str=new StringBuilder(strs.pop());
                int count=counts.pop();
                for(int j=0;j<count;j++){
                    str.append(res);
                }
                res=str.toString();
                i++;
            }
            else{
                res+=s.charAt(i++);
            }
        }
        return res;
    }
}