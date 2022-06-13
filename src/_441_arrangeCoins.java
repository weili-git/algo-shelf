public class _441_arrangeCoins {
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        while(left<=right){
            long mid = left+(right-left)/2;
            if(mid*mid+mid<(long)2*n){
                left = (int)mid+1;
            }else if(mid*(mid+1)>(long)2*n){
                right = (int)mid-1;
            }else{
                return (int)mid;
            }
        }
        return left-1;
    }
}
