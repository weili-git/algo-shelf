import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  // key

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){  // 三个整数相加不可能为0  three positive numbers can't add up to 0
                return res;
            }
            if(i>0 && nums[i]==nums[i-1]){  // avoid repeated calculations
                continue;
            }
            // left right pointer
            int left = i+1;
            int right = nums.length - 1;
            while (right>left){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum>0){
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(right>left && nums[right]==nums[right-1]) right--;    // 避免重复 avoid repeated calculation
                    while(right>left && nums[left]==nums[left+1]) left++;

                    right--;
                    left++;
                }
            }
        }
        return res;
        // time complexity: O( n*log(n) + n*n )
    }
}
