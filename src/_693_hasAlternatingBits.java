public class _693_hasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int m = n ^ (n>>1); // 00001111
        return (m&(m+1)) == 0;
    }
}
