package package1;

public class Sol370 {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        
        for(int i = 0; i < updates.length; i++){
            res[updates[i][0]]+=updates[i][2];
            if(updates[i][1]+1<length){
                res[updates[i][1]+1]-=updates[i][2];
            }
        }
        
        for(int i = 1; i < res.length; i++){
            res[i] = res[i]+res[i-1];
        }
        
        return res;
    }
}