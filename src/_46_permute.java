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
                if(!path.contains(nums[i])) // key point
                {
                    path.add(nums[i]);
                    helper(nums, ans, path);
                    path.remove(path.size()-1);
                }
            }
        }
    }

//    List<List<Integer>> res;
//    List<Integer> path;
//    boolean[] vis;
//    public List<List<Integer>> permute(int[] nums) {
//        int n = nums.length;
//        res = new ArrayList<>();
//        path = new ArrayList<>();
//        vis = new boolean[n];
//        Arrays.fill(vis, false);
//        for(int i=0;i<n;i++){
//            help(nums, i);
//        }
//        return res;
//    }
//    private void help(int[] nums, int index){
//        if(path.size()==nums.length && index==0){   // not n-1 times
//            res.add(new ArrayList(path));
//        } else if(!vis[index]){
//            vis[index] = true;
//            path.add(nums[index]);
//            for(int i=0;i<nums.length;i++){
//                help(nums, i);
//            }
//            vis[index] = false;
//            path.remove(path.size()-1);
//        }
//    }
}
