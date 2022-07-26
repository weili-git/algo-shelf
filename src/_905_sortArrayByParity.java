public class _905_sortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=nums.length-1;
        int tmp;
        while(i<j){
            while(i<j && (nums[i]&1)==0) i++;
            while(i<j && (nums[j]&1)==1) j--;
            if(i<j){
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }
}
