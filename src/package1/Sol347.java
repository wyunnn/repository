package package1;
import java.util.*;

public class Sol347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(a.containsKey(nums[i])){
                a.put(nums[i],a.get(nums[i])+1);
            }
            else
                a.put(nums[i], 1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> b = new PriorityQueue<Map.Entry<Integer,Integer>>(
            k, new Comparator<Map.Entry<Integer, Integer>>() {
                public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                    return e1.getValue() - e2.getValue();
                }
            });
            
        for(Map.Entry<Integer, Integer> entry: a.entrySet()){
            if(b.size()<k){
                b.add(entry);
            }
            else if(entry.getValue() > b.peek().getValue()){
                b.poll();
                b.add(entry);
            }
        }
        
        List<Integer> c = new LinkedList<Integer>();
        while(b.size()>0){
            c.add(b.poll().getKey());
        }
        
        return c;
    }
}