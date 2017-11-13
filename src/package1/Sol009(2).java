class Solution {
    public boolean isPalindrome(int x) {
        String a = Integer.toString(x);
        int i = 0, j = a.length()-1;
        
        while(i < j){
            if (a.charAt(i) == a.charAt(j)){
                i++;
                j--;
            }
            else 
                return false;
        }
        return true;
    }
}
