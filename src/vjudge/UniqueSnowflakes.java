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
                int snownum = Integer.parseInt(a.next());
                a.nextLine();
                int[] snows = new int[snownum];
                
                for(int j = 0; j< snownum; j++){
                    snows[j] = Integer.parseInt(a.nextLine());
                }
                System.out.println(snowbag(snows));
             }
         }
    }
    public static int snowbag(int[] snows){
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int left = -1;
        int max = 0;
        for(int i = 0; i < snows.length; i++){
            if(!hm.containsKey(snows[i])){
                hm.put(snows[i], i);
            }
            else{
                left = Math.max(left, hm.get(snows[i]));
                hm.put(snows[i], i);
            }
            max = Math.max(max, i - left);
        }
        return max;
    }
}
