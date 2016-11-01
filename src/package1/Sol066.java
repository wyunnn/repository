package package1;

public class Sol066 {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        int a = 1;
        
        for(int i = l - 1; i>=0; i--){
            if(digits[i]+a==10){
                digits[i] = 0;
            }
            else{
                digits[i]+=a;
                a = 0;
            }
        }
        
        if (a == 1){ // if 9999...
            int[] r = new int[l+1];
            r[0] = 1;
            for(int m = 1; m<l+1; m++){ //from r[1] to r[l]
                r[m] = 0;
            }
            return r;
        }
        
        return digits;
    }
}