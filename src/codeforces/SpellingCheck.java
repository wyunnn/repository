import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) throws Exception{
        
        //Scanner scanner = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String s1 = in.readLine();
        String s2 = in.readLine();
        
        in.close();
        
        int start = 0, end = 0;
        char lastchar = s1.charAt(0);
        int idx = 0;
        boolean ex = false;
        
        
        for (int i = 0, j = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            
            if(j < s2.length() && c1 == s2.charAt(j)){
                j++;
                if(c1 != lastchar){
                    lastchar = c1;
                    idx = i;
                }
            }
            else if (ex == false){
                if(c1 != lastchar){
                    start = i;
                    end = i;
                    ex = true;
                }
                else{
                    start = idx;
                    end = i;
                    ex = true;      
                }
                
            }
            else{ // ex = true;
                end = -1;
                break;
            }
        }
        
        if(end == -1){
            System.out.println(0);
        }
        else{
            System.out.println(end-start+1);
            StringBuffer output = new StringBuffer();
            for (; start <= end; start++){
                output.append((start+1) + " ");
            }
            System.out.println(output);
        }
    }
}
