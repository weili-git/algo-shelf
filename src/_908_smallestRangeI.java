public class _908_smallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int min=nums[0],max=nums[0];
        for(int num:nums){
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        return (max-min>k*2)?(max-min-k*2):0;
    }
}
