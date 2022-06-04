import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _350_intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums1) {
            if(map.containsKey(num)){
                map.replace(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int num:nums2){
            if(map.containsKey(num)){
                if(map.get(num)>0){
                    map.replace(num, map.get(num)-1);
                    res.add(num);
                }
            }
        }
        int[] ret = new int[res.size()];
        int i=0;
        for(int num:res){
            ret[i++] = num;
        }
        return ret;
    }
}
