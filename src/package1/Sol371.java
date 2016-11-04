package package1;

public class Sol371 {
    public int getSum(int a, int b) {
        if(b==0)    return a;
        int s = a ^ b;
        int carry = (a & b) << 1;
        return getSum(s, carry);
    }
}