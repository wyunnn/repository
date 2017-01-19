package package1;

public class Sol461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}