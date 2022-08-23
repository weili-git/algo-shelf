import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _2085_countWords {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(String str: words1){
            map1.put(str, map1.getOrDefault(str, 0)+1);
        }
        for(String str: words2){
            map2.put(str, map2.getOrDefault(str, 0)+1);
        }
        int res = 0;
        for(String str: map1.keySet()){
            if(map2.containsKey(str) && map1.get(str)==1 && map2.get(str)==1){
                res++;
            }
        }
        return res;
        // 理解题意，均只出现一次
    }
}
