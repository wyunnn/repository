package package1;

public class Sol433 {
    public int minMutation(String start, String end, String[] bank) {
        
        int [] visit = new int [bank.length];
        int min = helper(start, end, bank, visit);
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    
    private int helper(String cur, String end, String[] bank, int[] visit){
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < bank.length; i++){
            if(difference(cur, end)==0){
                return 0;
            }
            else if(difference(cur, bank[i])==1 && visit[i] == 0){
                visit[i] = 1;
                int r = helper(bank[i], end, bank, visit);
                min = r != Integer.MAX_VALUE ? Math.min(r + 1, min) : min;
                visit[i] = 0;
            }
        }
        return min;
    }
    
    private int difference(String a, String b){
        int ret = 0;
        if(a.length() != b.length())
            return Integer.MAX_VALUE;
            
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i))
                ret++;
        }
        return ret;
    }
}