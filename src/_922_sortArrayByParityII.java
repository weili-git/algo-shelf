public class _922_sortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0,j=1;
        final int n = nums.length;
        int tmp;
        while(i<n&&j<n){
            while(i<n&&(nums[i]&1)==0) i+=2;
            while(j<n&&(nums[j]&1)==1) j+=2;
            if(i>=n||j>=n) break;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i+=2;
            j+=2;
        }
        return nums;
    }
}
