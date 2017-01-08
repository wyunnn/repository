package package1;

import java.util.Arrays;

public class Sol135 {
    public int candy(int[] ratings) {
        int sum = 0;
        int[] num = new int[ratings.length];
        Arrays.fill(num, 1);
        
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                num[i] = num[i-1]+1;
            }
        }
        
        for(int i = ratings.length - 1; i > 0; i--){
            if(ratings[i-1] > ratings[i]){
                num[i-1] = Math.max(num[i-1], num[i]+1); 
            }
        }
        
        for(int i = 0; i < ratings.length; i++){
            //System.out.println(num[i]);
            sum += num[i];
        }
        return sum;
    }
}