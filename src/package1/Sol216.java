class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        helper(res, tmp, k, n, 1);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> tmp, int k, int n, int cur){
        if(k == 0 && n == 0){
            res.add(new ArrayList<>(tmp));
            return;
        }
        if(k < 0 || n < 0){
            return;
        }
        else{
            for(int i = cur; i < 10; i++){
                tmp.add(i);
                helper(res, tmp, k-1, n-i, i+1);
                tmp.remove(tmp.size()-1);
            }
        }
        
    }  
}
