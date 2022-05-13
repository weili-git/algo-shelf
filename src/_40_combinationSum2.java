import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40_combinationSum2 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, target, 0, 0);
        return ans;
    }
    private void helper(int[] candidates, int target, int sum, int startIndex){
        if(sum>target){
            return;
        }else if(sum==target){
            ans.add(new ArrayList<>(path));
        }
        for(int i=startIndex;i<candidates.length;i++){
            if(i>startIndex && candidates[i] == candidates[i-1]) continue;  //  key point
            path.add(candidates[i]);
            helper(candidates, target, sum+candidates[i],i+1);
            path.remove(path.size()-1);
        }
    }
}
