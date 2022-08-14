import java.util.*;

public class _884_uncommonFromSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String str: s1.split(" ")){
            if(!map.containsKey(str)){
                map.put(str, 1);
            }else{
                map.put(str, map.get(str)+1);
            }
        }
        for(String str: s2.split(" ")){
            if(!map.containsKey(str)){
                map.put(str, 1);
            }else{
                map.put(str, map.get(str)+1);
            }
        }
        for(String str: map.keySet()){
            if(map.get(str)==1){
                res.add(str);
            }
        }
        if(res.size()==0) return new String[0];
        return res.toArray(new String[res.size()-1]);
    }
}
