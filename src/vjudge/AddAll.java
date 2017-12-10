
import java.util.*;

public class Main {
    public static void main(String args[]) {
        
         Scanner a = new Scanner(System.in);
         
         while(a.hasNext()){
             int num = Integer.parseInt(a.next());
             
             if(num == 0){
                 return;
             }
             
             int [] input = new int[num];
             
             for(int i = 0; i < num; i++){
                 input[i] = Integer.parseInt(a.next());
             }
             
             System.out.println(cost(input));
         }
    }
    public static int cost(int[] input){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i = 0; i < input.length; i++){
            pq.offer(input[i]);
        }
        
        int sum = 0;
        
        while(pq.size() > 1){
            int a1 = pq.poll();
            int a2 = pq.poll();
            
            sum+=(a1+a2);
            pq.offer(a1+a2);
        }
        
        return sum;
        
    }
}
