public class _2341_numberOfPairs {
    public int[] numberOfPairs(int[] nums) {
        int[] cnt = new int[101];
        for(int num:nums){
            cnt[num]++;
        }
        int op = 0;
        int leftover = 0;
        int tmp;
        for(int i=0;i<101;i++){
            tmp = cnt[i];
            if(tmp%2!=0){
                leftover++;
            }
            op += tmp/2;
        }
        return new int[]{op, leftover};
    }
}
