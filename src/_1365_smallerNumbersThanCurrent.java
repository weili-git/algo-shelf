import java.util.Arrays;
import java.util.HashMap;

public class _1365_smallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            map.put(arr[i], i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
