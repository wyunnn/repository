package package1;

public class Sol038 {
    public String countAndSay(int n) {
        if(n == 0)  return null;
        String s = "1";
        String rs;
        
        for (int i = 1; i < n; i++){
            rs = "";
            char a = s.charAt(0);
            int count = 1;
            
            for(int j = 1; j < s.length(); j++){
                char cc = s.charAt(j);
                if(cc == a){
                    count++;
                }
                else{
                    rs = rs + count + a;
                    a = cc;
                    count = 1;
                }
            }
            s = rs + count + a;
        }
        return s;
    }
}