import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18_fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int size = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<size;i++){
            if(i!=0 && nums[i-1]==nums[i]) continue; // continue instead of i++
            for(int j=i+1;j<size;j++){
                if(j!=i+1 && nums[j-1]==nums[j]) continue;
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    int fourSum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(fourSum<target){
                        left++;
                    }else if(fourSum>target){
                        right--;
                    }else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                    }
                    while (left != j + 1 && left < right && nums[left] == nums[left - 1]) left++;
                    while (right != size - 1 && left < right && nums[right] == nums[right + 1]) right--;
                }

            }

        }
        return res;
    }
}
