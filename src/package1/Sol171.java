package package1;

public class Sol171 {
    public int titleToNumber(String s) {
        int ret = 0;
        for(int i=0; i< s.length(); i++){
            char a = s.charAt(i);
            ret = ret * 26 + (a - 'A' + 1);
        }
        return ret;
    }
}