public class _461_hammingDistance {
    public int hammingDistance(int x, int y) {
        int z = x^y;
        int sum=0;
        while(z!=0){
            sum += z & 1;
            z = z>>1;
        }
        return sum;
    }
}
