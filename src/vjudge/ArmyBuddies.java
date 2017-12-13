import java.util.*;
import java.io.*;


public class Main {
    
    public static void main(String args[]) throws Exception{
        
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        
        String curline;
        StringBuilder sb = new StringBuilder();
        
        while((curline = a.readLine()) != null){
        
            String [] tmpline = curline.split(" ");
            int nums = Integer.parseInt(tmpline[0]);
            int numb = Integer.parseInt(tmpline[1]);
            
            if(nums == 0){
                System.out.print(sb.toString());
                return;
            }
            
            int[] left = new int[nums];
            int[] right = new int[nums];
            
            for(int i = 0; i < nums; i++){
                left[i] = i;
                right[i] = i+2;
            }
            
            for(int i = 0; i < numb; i++){
                tmpline = a.readLine().split(" ");
                
                int L = Integer.parseInt(tmpline[0]);
                int R = Integer.parseInt(tmpline[1]);
                L--; R--;
                
                if(left[L] == 0){
                    sb.append("* ");
                }
                else{
                    sb.append(left[L] + " ");
                }
                
                if(right[R] == nums + 1){
                    sb.append("*\n");
                }
                else{
                    sb.append(right[R]+"\n");
                }
                
                if(left[L]-1 >= 0)                 right[left[L]-1] = right[R];
                if(right[R]-1 < nums)              left[right[R]-1] = left[L];

            }
            
            sb.append("-\n");
        }
        
    }
}
