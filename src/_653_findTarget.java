import java.util.HashSet;
import java.util.Set;

public class _653_findTarget {
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root,k);
    }
    private boolean dfs(TreeNode root, int k){
        if(root==null) return false;
        if(set.contains(root.val)) return true;
        set.add(k-root.val);
        return dfs(root.left,k) || dfs(root.right,k);
    }
}
