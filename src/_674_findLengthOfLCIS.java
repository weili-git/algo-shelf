public class _674_findLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        int res = 1;
        int cur = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                cur++;
            }else{
                res = Math.max(cur, res);
                cur = 1;
            }
        }
        res = Math.max(res,cur); //
        return res;
    }
}
