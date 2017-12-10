import java.util.*;
import java.io.*;


public class Main {
    
    static HashMap<Integer, ArrayList<Integer>> hm;
    
    public static void main(String args[]) throws Exception{
        
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        
        String curline;
        StringBuilder sb = new StringBuilder();
        
        while((curline = a.readLine()) != null){
        
             String [] tmpline = curline.split(" ");
             int numnum = Integer.parseInt(tmpline[0]);
             int numtest = Integer.parseInt(tmpline[1]);
    
             String[] numstring = a.readLine().split(" ");
             
             hm = new HashMap<>();
             for(int i = 0; i < numnum; i++){
                int key = Integer.parseInt(numstring[i]);
                
                if(!hm.containsKey(key)){
                    hm.put(key, new ArrayList<Integer>());
                }
                
                ArrayList<Integer> tmpList = hm.get(key);
                tmpList.add(i);
                hm.put(key, tmpList);
             }
             
             for(int i = 0; i < numtest; i++){
                 
                curline = a.readLine();
                tmpline = curline.split(" ");
    
                int pos = Integer.parseInt(tmpline[0]);
                int key = Integer.parseInt(tmpline[1]);
    
                if(hm.get(key).size() < pos){
                    sb.append("0\n");
                }
                else{
                    sb.append(hm.get(key).get(pos-1)+1); 
                    sb.append("\n");
                }
             }
        }
        
        System.out.print(sb.toString());
    }
}
