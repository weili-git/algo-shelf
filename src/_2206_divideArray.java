public class _2206_divideArray {
    public boolean divideArray(int[] nums) {
        int[] cnt = new int[501];
        for(int num:nums){
            cnt[num]++;
        }
        for(int num:cnt){
            if(num%2==1) return false;
        }
        return true;
    }
}
