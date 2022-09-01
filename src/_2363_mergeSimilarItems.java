import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class _2363_mergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<items1.length;i++){
            map.put(items1[i][0], items1[i][1]);
        }
        for(int i=0;i<items2.length;i++){
            map.put(items2[i][0], map.getOrDefault(items2[i][0], 0) + items2[i][1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int key:map.keySet()){
            List<Integer> item = new ArrayList<>();
            item.add(key);
            item.add(map.get(key));
            res.add(item);
        }
        return res;
    }
}
