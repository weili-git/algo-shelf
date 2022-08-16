import java.util.*;

public class _1436_destCity {
    public String destCity(List<List<String>> paths) {
//        Map<String, Integer> map = new HashMap<>();
//        String tmp;
//        for(List<String> pair:paths){
//            tmp = pair.get(0);
//            map.put(tmp, map.getOrDefault(tmp, 0)-1);
//            tmp = pair.get(1);
//            map.put(tmp, map.getOrDefault(tmp, 0)+1);
//        }
//        for(String str: map.keySet()){
//            if(map.get(str)==1) return str;
//        }
//        return "";

        // 更好的方法
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (List<String> list : paths)
            map.put(list.get(0), 1);
        for (List<String> list : paths)
            if (map.get(list.get(1)) == null)
                return list.get(1);
        return null;
    }
}
