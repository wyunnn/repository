class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(res, new ArrayList<String>(), s, 0);
        return res;    
    }
    public void helper(List<List<String>> res, List<String> tmp, String s, int cur){
        if(cur == s.length()){
            res.add(new ArrayList<>(tmp));
            return;
        }
        else{
            for(int i = cur+1; i <= s.length(); i++){
                String tmpstring = s.substring(cur, i);
                if(isPalindrome(tmpstring)){
                    tmp.add(tmpstring);
                    helper(res, tmp, s, i);
                    tmp.remove(tmp.size()-1);
                }
            }
        }
    }
    
    public boolean isPalindrome(String s){
        int i = 0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
}
