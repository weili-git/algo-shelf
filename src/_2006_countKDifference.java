import java.util.HashMap;

public class _2006_countKDifference {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int res = 0;
        for(int key: map.keySet()){
            if(map.containsKey(key+k)){ // single
                res += map.get(key)*map.get(key+k);
            }
        }
        return res;
    }
}
