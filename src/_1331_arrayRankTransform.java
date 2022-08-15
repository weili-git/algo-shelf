import java.util.Arrays;
import java.util.HashMap;

public class _1331_arrayRankTransform {
    public int[] arrayRankTransform(int[] arr) {// 理解中...先排序
        // 先复制一份数据到新的数组，排序新数组
        int[] a = arr.clone();
        Arrays.sort(a);

        // 利用HashMap去重，赋值该数组的所求序号
        int temp = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            if (!map.containsKey(a[i])) {
                temp++;
                map.put(a[i], temp);
            }
        }

        // 比对map中的元素实际位置，赋值
        for (int i = 0; i < arr.length; i++) {
            a[i] = map.get(arr[i]);
        }
        return a;
    }
}
