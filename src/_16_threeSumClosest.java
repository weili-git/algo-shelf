import java.util.Arrays;

public class _16_threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++){
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
