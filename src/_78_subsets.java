import java.util.ArrayList;
import java.util.List;

public class _78_subsets {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0);
        return res;
    }
    private void helper(int [] nums, int pos){
        if(pos==nums.length){
            res.add(new ArrayList<>(path));
        }
        else{
            path.add(nums[pos]);
            helper(nums, pos+1);
            path.remove(path.size()-1);
            helper(nums, pos+1);
        }
    }
}
