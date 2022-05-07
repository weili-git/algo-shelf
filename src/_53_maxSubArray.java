import static java.lang.Math.max;

public class _53_maxSubArray {
    public static int maxSubArray(int[] nums) {
        // 每次贪婪的向右取数，使得和大于 0，如果小于 0，则说明左边的和会使得接下来的和变小，所以直接丢掉即可。
        int mmax = -999999;     //  Be careful about the negative value
        int current = 0;
        for(int i=0;i<nums.length;i++){
            if(current+nums[i]>0){
                current += nums[i];
                mmax = max(mmax, current);
            }else{
                current = 0;
                mmax = max(mmax, nums[i]);
            }
        }
        return mmax;
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        System.out.println(maxSubArray(nums));
    }
}
