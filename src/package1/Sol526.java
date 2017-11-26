class Solution {
    public int countArrangement(int N) {    
        boolean[] used = new boolean[N+1];
        return helper(used, 1, N);
    }
    public int helper(boolean[] used, int pos, int n){
        if(pos == n+1){
            return 1;
        }
        else{
            int sum = 0;
            for(int i = 1; i <= n; i++){
                if(!used[i] && divisible(pos, i)){
                    used[i] = true;
                    sum += helper(used, pos+1, n);
                    used[i] = false;
                }
            }
            return sum;
        }
    }
    
    public boolean divisible(int i, int j){
        return (i%j==0 || j%i ==0);
    }
}
