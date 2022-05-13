import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _39_combinationSum {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, 0, 0);
        return res;
    }
    private void helper(int[] candidates, int target, int sum, int startIndex){
        if(sum > target || startIndex==candidates.length){
            return;
        }
        else if(sum==target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<candidates.length;i++){
            path.add(candidates[i]);
            helper(candidates, target, sum+candidates[i], i);
            // one elem can be used more than once.
            path.remove(path.size()-1);
        }

    }
}
