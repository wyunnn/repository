package package1;
import java.util.*;

public class Sol378 {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> a = new PriorityQueue<Integer>(k+1, new Comparator<Integer> (){
            public int compare(Integer l, Integer r){
                if(l > r) return -1;
                if(l < r) return 1;
                else      return 0;
            }
        });
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(a.size() < k){
                    a.add(matrix[i][j]);
                }
                else{
                    a.add(matrix[i][j]);
                    a.poll();
                }
            }
        }
        
        return a.poll();
    }
}