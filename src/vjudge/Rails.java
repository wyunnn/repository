import java.util.*;

public class Main {
    public static void main(String args[]) {
        
         Scanner a = new Scanner(System.in);
         
         while(a.hasNext()){
             int num = Integer.parseInt(a.nextLine());
             if(num == 0){
                 return;
             }
             while(a.hasNext()){
                 String next = a.nextLine();
                 
                 if(next.equals("0")){
                    System.out.println("");
                    break;
                 }
                 
                 String[] tmpinput = next.split(" ");
                 int[] input = new int[num];
                 for(int i = 0; i < num; i++){
                     input[i] = Integer.parseInt(tmpinput[i]);
                 }
                 
                 System.out.println(rail(input, num));
             }
             
         }
    }
    public static String rail(int[] input, int n){
        int c = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 1; i <= n; i++){
            if(input[c] == i){
                c++;
                continue;
            }
            else{
                while(!stack.empty() && input[c] == stack.peek()){
                    c++;
                    stack.pop();
                }
                    stack.push(i);
            }
        }
        while(!stack.empty()){
            if(input[c] == stack.pop()){
                c++;
                continue;
            }
            else{
                return "No";
            }
        }
        return "Yes";
        
    }
}
