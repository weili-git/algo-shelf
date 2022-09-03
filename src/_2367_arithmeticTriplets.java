public class _2367_arithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int[] cnt = new int[201];
        for(int num:nums){
            cnt[num] = 1;
        }
        int res = 0;
        for(int i=0;i<201-2*diff;i++){
            if(cnt[i]==1 && cnt[i+diff]==1 && cnt[i+2*diff]==1){
                res++;
            }
        }
        return res;
    }
}
