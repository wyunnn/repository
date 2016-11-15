package package1;
import java.util.*;

public class Sol388 {
    public int lengthLongestPath(String input) {
        ArrayList<Integer> directories = new ArrayList<Integer>();
        int max = 0;
        
        for(String s: input.split("\n")){
            int level = s.lastIndexOf("\t")+1;
            directories.add(level, s.length()-level);
            
            if(s.lastIndexOf(".") != -1){
                int tmp = -1;
                Iterator<Integer> itr = directories.iterator();
                for(int i = 0; i < level+1; i++){
                    tmp = tmp + itr.next()+1;
                }
                if(tmp > max){
                    max = tmp;
                }
            }
        }
        return max;
    }
}