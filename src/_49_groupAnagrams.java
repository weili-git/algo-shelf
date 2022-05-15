import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _49_groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
//        HashMap<String, ArrayList<String>> map = new HashMap<>();
//        for(String s:strs){
//            char[] ch = s.toCharArray();
//            Arrays.sort(ch);
//            String key = String.valueOf(ch);
//            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
//            map.get(key).add(s);
//        }
//        return new ArrayList(map.values());
        HashMap<Double, ArrayList<String>> map = new HashMap<>();
        double[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101};
        for(String s:strs){
            double key = 1;
            for(char ch:s.toCharArray()){
                key *= prime[ch-'a'];
            }
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

}
