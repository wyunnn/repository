package package1;
import java.util.*;

public class Sol452 {
    public int findMinArrowShots(int[][] points) {
        int res = points.length;
        if(points.length == 0)  return 0;
        
        Arrays.sort(points, new Comparator<int []>() {
            public int compare(int [] l, int [] r){
                int i = l[1] - r[1];
                return i;
            }
        });
        
        int right =  points[0][1];
        for (int i = 1; i < points.length; i++){
            if (points[i][0] <= right){
                res--;
            }
            else
                right = points[i][1];
        }
        
        return res;
    }
}