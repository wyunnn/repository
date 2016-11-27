package package1;

public class Sol011 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = (r-l) * Math.min(height[l], height[r]);
        
        while(l < r){
            if(height[l] < height[r]){
                res = Math.max(res, (r-l) * height[l]);
                l++;
            }
            else{
                res = Math.max(res, (r-l) * height[r]);
                r--;
            }
        }
        
        return res;
    }
}