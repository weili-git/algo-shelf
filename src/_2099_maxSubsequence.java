import java.util.Arrays;
import java.util.HashMap;

public class _2099_maxSubsequence {
    public int[] maxSubsequence(int[] nums, int k) {
        if(nums.length==k) return nums; // 保证顺序
        int[] newNums = new int[nums.length];
        System.arraycopy(nums, 0, newNums, 0, nums.length);
        Arrays.sort(newNums);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = newNums.length - k; i < newNums.length; i++) { // 最后k个最大值存入map
            map.put(newNums[i],map.getOrDefault(newNums[i],0) + 1);
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(map.getOrDefault(nums[i],0) > 0 && index < k){
                map.put(nums[i],map.get(nums[i])-1);
                res[index++] = nums[i];
            }
        }
        return res;
    }
}
