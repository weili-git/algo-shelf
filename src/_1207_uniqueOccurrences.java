import java.util.HashMap;
import java.util.HashSet;

public class _1207_uniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return map.size() == new HashSet<Integer>(map.values()).size();
    }
}
