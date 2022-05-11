public class _278_firstBadVersion {
    int bad = 11;
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left<right){
            int mid = left+(right-left)/2;
            if(isBadVersion(mid)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        if(isBadVersion(right))
            return right;
        else
            return right+1;
    }
    private boolean isBadVersion(int arg){
        return arg==bad;
    }
}
