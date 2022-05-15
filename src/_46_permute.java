import java.util.ArrayList;
import java.util.List;

public class _46_permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(nums, ans, path);
        return ans;
    }
    private void helper(int[] nums, List<List<Integer>> ans, List<Integer> path){
        if(path.size()==nums.length){
            ans.add(new ArrayList<>(path));
        }
        else {
            for(int i=0;i<nums.length;i++){
                if(!path.contains(nums[i]))
                {
                    path.add(nums[i]);
                    helper(nums, ans, path);
                    path.remove(path.size()-1);
                }
            }
        }
    }
}
