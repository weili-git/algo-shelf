public class _747_dominantIndex {
    public int dominantIndex(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int res = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max1){
                max2 = max1;
                max1 = nums[i];
                res = i;
            }else if(nums[i]>max2){
                max2 = nums[i];
            }
        }
        return max1>=max2*2?res:-1;
    }
}
