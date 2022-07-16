public class _643_findMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        int max = sum;// double 运算更慢
        for(int j=k;j<nums.length;j++){
            sum -= nums[j-k];
            sum += nums[j];
            max = Math.max(sum, max);
        }
        return (double)max/k;
    }
}
