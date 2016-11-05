package package1;

public class Sol038 {
    public String countAndSay(int n) {
        if(n == 0)  return null;
        String s = "1";
        StringBuilder rs;
        
        for (int i = 1; i < n; i++){
            rs = new StringBuilder();
            char [] aa = s.toCharArray();
            char a = s.charAt(0);
            int count = 1;
            
            for(int j = 1; j < aa.length; j++){
                char cc = aa [j];
                if(cc == a){
                    count++;
                }
                else{
                    rs = rs.append(count).append(a);
                    a = cc;
                    count = 1;
                }
            }
            s = rs.append(count).append(a).toString();
        }
        return s;
    }
}

/*
 * two modifications to improve speed:
 * (1) String s -> s.toCharArray()
 * (2) StringBuilder (faster for append and delete)
 * 
 */


/*
 * Slower version
 *
public class Sol038 {
    public String countAndSay(int n) {
        if(n == 0)  return null;
        StringBuilder s = new StringBuilder("1");
        StringBuilder rs;
        
        for (int i = 1; i < n; i++){
            rs = new StringBuilder();
            char a = s.charAt(0);
            int count = 1;
            
            for(int j = 1; j < s.length(); j++){
                char cc = s.charAt(j);
                if(cc == a){
                    count++;
                }
                else{
                    rs = rs.append(count).append(a);
                    a = cc;
                    count = 1;
                }
            }
            s = rs.append(count).append(a);
        }
        return s.toString();
    }
}*/