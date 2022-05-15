import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _47_permuteUnique {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);
        helper(nums, used);
        return ans;
    }
    private void helper(int[] nums, boolean[] used){
        if(path.size()==nums.length){
            ans.add(new ArrayList<>(path));
        }else{
            for(int i=0;i<nums.length;i++){
                if(i>0 && nums[i]==nums[i-1] && used[i-1]==false){// 1_1, 1_2, 2 yes 1_2, 1_1, 2 no ;逆序排除
                    continue;
                }
                if(used[i]==false){
                    used[i]=true;
                    path.add(nums[i]);
                    helper(nums,used);
                    path.remove(path.size()-1);
                    used[i]=false;
                }
            }
        }
    }
}
