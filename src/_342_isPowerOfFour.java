public class _342_isPowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n<1) return false;
        else if(n==1) return true;
        else if(n%4!=0) return false;
        else return isPowerOfFour(n/4);
    }
}
