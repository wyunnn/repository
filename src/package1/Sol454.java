class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                int m = A[i]+B[j];
                if(hm.containsKey(m)){
                    hm.put(m, hm.get(m)+1);
                }
                else{
                    hm.put(m, 1);
                }
            }
        }
        int res = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                int m = C[i]+D[j];
                if(hm.containsKey(-m)){
                    res+=hm.get(-m);
                }
            }
        }
        return res;
    }
}
