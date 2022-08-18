public class _1512_numIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        int[] cnt = new int[101];
        for(int num: nums){
            cnt[num]++;
        }
        int res = 0;
        for(int n: cnt){
            if(n>1){
                res += n*(n-1)/2;
            }
        }
        return res;
    }
}
