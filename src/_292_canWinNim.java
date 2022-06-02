public class _292_canWinNim {
    public boolean canWinNim(int n) {
        // 1110 1110 1110
        return (n-1)%4!=3;
    }
}
