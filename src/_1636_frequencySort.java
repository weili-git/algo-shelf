import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1636_frequencySort {// 有点麻烦
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> resMap = new HashMap<>();
        List<Integer> numsList = new ArrayList<>();
        //统计次数
        for (int curr : nums) {
            numsList.add(curr);
            resMap.put(curr, resMap.getOrDefault(curr, 0) + 1);
        }
        //按规则排序
        numsList.sort((a, b) -> {
            int aCount = resMap.get(a);
            int bCount = resMap.get(b);
            if (aCount == bCount) {
                return b - a;
            }
            return aCount - bCount;
        });

        return numsList.stream().mapToInt(Integer::intValue).toArray();
    }
}
