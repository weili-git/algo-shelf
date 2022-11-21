import java.util.ArrayList;
import java.util.List;

public class _113_pathSum {
    private List<Integer> path = new ArrayList<>();
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return res;
    }
    private void dfs(TreeNode root, int targetSum){
        if(root==null) return;
        path.add(root.val);
        dfs(root.left, targetSum-root.val);
        if(root.left==null && root.right==null){ // leaf
            if(root.val==targetSum) { // valid sum
                res.add(new ArrayList<>(path));
            }
        }
        dfs(root.right, targetSum-root.val);
        path.remove(path.size()-1);
    }
}
