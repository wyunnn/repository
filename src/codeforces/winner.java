import java.lang.Math; // headers MUST be above the first class
import java.util.*;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Scanner cin = new Scanner(System.in);
    
    int n = cin.nextInt();
    String [] names = new String[n];
    int [] scores = new int[n];
    HashMap<String, Integer> a = new HashMap<>();
    
    for(int i = 0; i < n; i++){
        String name = cin.next();
        names[i] = name;
        int score = cin.nextInt();
        scores[i] = score;
    }
    
    for(int i = 0; i < n; i++){
        if(a.containsKey(names[i])){
            a.put(names[i], a.get(names[i])+scores[i]);
        }
        else{
            a.put(names[i], scores[i]);
        }
    }
    
    int max = Integer.MIN_VALUE;
    
    for(String name : a.keySet()){
        if(a.get(name) > max){
            max = a.get(name);
        }
    }
    
    HashMap<String, Integer> b = new HashMap<>();
    String final_name = "";
    for(int i = 0; i < n; i++){
        if(b.containsKey(names[i])){
            b.put(names[i], b.get(names[i])+scores[i]);
        }
        else{
            b.put(names[i], scores[i]);
        }
        
        if(b.get(names[i]) >= max && a.get(names[i]) == max){
            final_name = names[i];
            System.out.println(final_name);
            break;
        }
    }
    
  }
  
}
