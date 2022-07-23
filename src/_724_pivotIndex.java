public class _724_pivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            nums[i] += nums[i-1];
        }
        int sum = nums[n-1];
        if(nums[0]==sum) return 0;
        for(int i=1;i<n;i++){
            if(nums[i-1]+nums[i]==sum) return i;
        }
        return -1;
    }
}
