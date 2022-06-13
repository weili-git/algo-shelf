import java.util.LinkedList;
import java.util.List;

public class _448_findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new LinkedList<>();
        int[] visit = new int[nums.length+1];
        for(int num:nums){
            visit[num]++;
        }
        for(int i=1;i<visit.length;i++){
            if(visit[i]==0) res.add(i);
        }
        return res;
    }
}
