package package1;

import java.util.*;

public class Sol249 {
    public List<List<String>> groupStrings(String[] strings) {
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        
        for(int i = 0; i < strings.length; i++){
            String tmp = "";
            for(int j = 1; j < strings[i].length(); j++){
                int n = strings[i].charAt(j)-strings[i].charAt(j-1);
                n = n < 0 ? n + 26 : n;
                tmp += n;
            }
            if(hm.containsKey(tmp)){
                List<String> list = hm.get(tmp);
                list.add(strings[i]);
                hm.put(tmp, list);
            }
            else{
                List<String> list = new ArrayList<String>();
                list.add(strings[i]);
                hm.put(tmp,list);
            }
        }
        
        List<List<String>> ret = new ArrayList<List<String>>();
        for(String key : hm.keySet()){
            ret.add(hm.get(key));
        }
        return ret;
    }
}