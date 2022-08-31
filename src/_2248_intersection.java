import java.util.ArrayList;
import java.util.List;

public class _2248_intersection {
    public List<Integer> intersection(int[][] nums) {
        int[] cnt = new int[1001];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                cnt[nums[i][j]]++;
            }
        }
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<1001;i++){
            if(cnt[i]==n) res.add(i);
        }
        return res;
    }
}
