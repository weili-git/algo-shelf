import java.util.Arrays;

public class _16_threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++){
            // 不能通过sum>target直接返回，因为上一次的求和位置不太确定，并非最左边的三个数
            // 不能通过nums[i]*3>target直接返回，因为后面可能都是负数，累加可能接近
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l = i+1; int r = nums.length-1;
            while (l<r){
                int threeSum = nums[i] + nums[l] + nums[r];
                if(Math.abs(threeSum-target)<Math.abs(closest-target)){
                    closest = threeSum;
                }
                if(threeSum>target){
                    r--;
                }else if (threeSum<target){
                    l++;
                }else{
                    return threeSum;
                }
            }
        }
        return closest;
    }
}
