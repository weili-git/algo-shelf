import java.util.HashMap;
import java.util.Iterator;

public class _594_findLHS {
    public int findLHS(int[] nums) {
        // exactly one!
        int LHS = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int num:nums){
            if(hash.containsKey(num)){
                hash.replace(num, hash.get(num)+1);
            }else{
                hash.put(num, 1);
            }
        }
        Iterator<Integer> itr = hash.keySet().iterator();
        while(itr.hasNext()){
            int key = itr.next();
            int pre = hash.getOrDefault(key-1,0);
            if(pre!=0){
                LHS = Math.max(LHS, hash.get(key)+pre);
            }
        }
        return LHS;
    }
}
