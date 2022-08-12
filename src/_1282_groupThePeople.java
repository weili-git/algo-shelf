import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _1282_groupThePeople {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            List<Integer> tmp;
            if(!map.containsKey(groupSizes[i])){
                 tmp = new ArrayList<>();

            }else{
                tmp = map.get(groupSizes[i]);
            }
            tmp.add(i);
            if(tmp.size()==groupSizes[i]){
                res.add(tmp);
                map.remove(groupSizes[i]);
            }else{
                map.put(groupSizes[i], tmp);
            }
        }
        return res;
    }
}
