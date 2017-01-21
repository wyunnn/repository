package package1;

public class Sol476 {
    public int findComplement(int num) {
        //System.out.println(~0 + 1);
        return ~num + (Integer.highestOneBit(num) << 1);
    }
}