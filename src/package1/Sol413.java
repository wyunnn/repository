package package1;

public class Sol413 {
    public int numberOfArithmeticSlices(int[] A) {
        int m = 0;
        int n = 0; //the length of one arithmetic sequence
        int diff = 0;
        int ans = 0;
        int length = A.length;
        
        for(int i = 0; i < length - 1 ; i++){
            if(diff == A[i+1] - A[i]){ //if the same do nothing
                if(i+1 == length -1){ //except the last one
                    n = (i+1)-m+1;
                    ans += (n*n - 3*n + 2) / 2;
                }
            }
            else{ // if they are different
                diff = A[i+1] - A[i];
                n = i-m+1;
                //if(n >= 3) is no need (ans = 0 when n = 1 or n = 2)
                ans += (n*n - 3*n + 2) / 2;
                m = i;
            }
        }
        return ans;
    }
}