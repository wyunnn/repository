package package1;
import java.util.*;

public class Sol451{
    public String frequencySort(String s) {
        HashMap<Character, Integer> a = new HashMap<Character, Integer>();
        
        for(char i : s.toCharArray()){
            if (a.containsKey(i)){
                a.put(i, a.get(i)+1);
            }
            else
                a.put(i, 1);
        }
        
        List<Character>[] bucket = new List[s.length() +1];
        for (char i : a.keySet()){
            int freq = a.get(i);
            if(bucket[freq] == null){
                bucket[freq] = new LinkedList<Character>();
                bucket[freq].add(i);
            }
            else{
                bucket[freq].add(i);
            }
        }
        
        StringBuilder r = new StringBuilder();
        for(int i = bucket.length - 1; i >= 0; i--){
            if (bucket[i] != null){
                for(char b : bucket[i]){
                    for(int j = 0; j < i; j++)
                        r.append(b);
                }
            }
        }
        return r.toString();
    }
}