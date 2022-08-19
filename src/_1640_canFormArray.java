import java.util.HashMap;
import java.util.Map;

public class _1640_canFormArray {
    public boolean canFormArray(int[] arr, int[][] pieces) {//有点麻烦
        Map<Integer, int[]> map = new HashMap<>();
        for (int[] piece : pieces) {    // 头元素作为索引，因为是distinct数组
            map.put(piece[0], piece);
        }

        for (int i = 0; i < arr.length;) {
            if (!map.containsKey(arr[i])) {
                return false;
            }
            int[] array = map.get(arr[i]);
            for (int j = 0; j < array.length; j++, i++) {
                if (arr[i] != array[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
