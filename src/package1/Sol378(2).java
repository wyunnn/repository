class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int [] pointers = new int[matrix.length];
        
        for(int i=0; i<pointers.length; i++){
            pointers[i] = 0;
        }
        
        int n = 0;
        int m = Integer.MAX_VALUE;

        for(int i = 0; i < k; i++){
            m = Integer.MAX_VALUE;
            for(int j = 0; j < matrix.length; j++){
                if(pointers[j] < matrix.length && matrix[j][pointers[j]]<m){
                    m = matrix[j][pointers[j]];
                    n = j;  
                }
            }
            pointers[n]++;
        }
        return m;
    }
}
