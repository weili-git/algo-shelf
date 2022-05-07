import java.util.HashMap;
import java.util.Map;

public class _219_containsNearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    // 关键，不满足上面判断，下标往后移动
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return  false;
    }
}
