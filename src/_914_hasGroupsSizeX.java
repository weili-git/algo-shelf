public class _914_hasGroupsSizeX {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for(int num:deck){
            count[num]++;
        }
        int x = 0;      // gcd
        for(int cnt:count){
            if(cnt>0){
                x = gcd(x, cnt);
                if(x==1) return false;
            }
        }
        return x>=2;
    }
    private int gcd(int a, int b){
        return b == 0? a: gcd(b, a % b);
    }
}
