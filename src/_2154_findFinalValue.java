public class _2154_findFinalValue {
    public int findFinalValue(int[] nums, int original) {
        int tmp = original;
        for(int num:nums){
            if(original==num){
                original = original*2;
            }
        }
        return original==tmp?original:findFinalValue(nums,original);
    }
}
