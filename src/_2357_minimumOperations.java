public class _2357_minimumOperations {
    public int minimumOperations(int[] nums) {
        int[] cnt = new int[101];
        for(int num:nums){
            cnt[num] = 1;
        }
        int op = 0;
        for(int i=1;i<101;i++){
            if(cnt[i]!=0){
                op++;
            }
        }
        return op;
    }
}
