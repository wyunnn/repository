package package1;

import java.util.*;

public class Sol356 {
    public boolean isReflected(int[][] points) {
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < points.length; i++){
            min = Math.min(min, points[i][0]);
            max = Math.max(max, points[i][0]);
        }
        final int mid = (max+min)/2;
        
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0] && o1[0] > mid){
                    return o2[1] - o1[1];
                }
                return o1[0] - o2[0];
            }
        });

        int i = 0, j = points.length - 1;
        int l = 0, r = 0;
        while(i < j){
            while(i<j && points[i+1][0] == points[i][0] && points[i+1][1] == points[i][1]){ //overlapping 
                i++;
            }
            while(i<j && points[j][0] == points[j-1][0] && points[j][1] == points[j-1][1]){ //overlapping
                j--;
            }
            if(points[i][0] == mid && points[j][0] == mid){
                return true;
            }
            if(i<j){
                l = points[i+1][0] - points[i][0];
                r = points[j][0] - points[j-1][0];
                if(l != r || points[i][1] != points[j][1]){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}