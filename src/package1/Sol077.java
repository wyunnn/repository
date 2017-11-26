class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        helper(res, tmp, n, k, 1);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> tmp, int n, int k, int cur){
        if(k==0){
            res.add(new ArrayList<>(tmp));
            return;
        }
        else{
            for(int i = cur; i <= n; i++){
                tmp.add(i);
                helper(res, tmp, n, k-1, i+1);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
