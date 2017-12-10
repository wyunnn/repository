import java.util.*;

public class Main {
    public static void main(String args[]) {
        
         Scanner a = new Scanner(System.in);
         
         while(a.hasNext()){
             int tests = Integer.parseInt(a.nextLine());
             if(tests == 0){
                 return;
             }
             
             for(int i = 0; i < tests; i++){
                 int ferry = Integer.parseInt(a.next());
                 int carnum = Integer.parseInt(a.next());
                 a.nextLine();
                 
                 String[] sides = new String[carnum];
                 int[] lengths = new int[carnum];
                 
                 for(int j = 0; j < carnum; j++){
                     lengths[j] = Integer.parseInt(a.next());
                     sides[j] = a.next();
                     a.nextLine();
                 }
                 
                System.out.println(ferry(lengths, sides, ferry));
             }
         }
    }
    public static int ferry(int[] lengths, String[] sides, int ferry){
 
        LinkedList<Integer> queueleft = new LinkedList<>();
        LinkedList<Integer> queueright = new LinkedList<>();
        
        for(int i = 0; i < lengths.length; i++){
            if(sides[i].equals("left")){
                queueleft.add(lengths[i]);
            }
            else{
                queueright.add(lengths[i]);
            }
        }
        
        int left = 0, right = 0;
        int tmp = 0;
        while(queueleft.size() > 0){
            if(tmp + queueleft.peek() < ferry * 100){
                tmp+=queueleft.poll();
            }
            else{
                tmp = 0;
                left++;
            }
        }
        if(tmp != 0){
            left++;
        }
        
        tmp = 0;
        while(queueright.size() > 0){
            
            if(tmp+queueright.peek() <= ferry * 100){
                tmp+=queueright.poll();
            }
            else{
                tmp = 0;
                right++;
            }
        }
        if(tmp != 0){
            right++;
        }
        
        if(left <= right){
            return right*2;    
        }
        else{
            return (left-1)*2+1;
        }
        
    }
}
