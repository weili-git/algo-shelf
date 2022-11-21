import java.util.ArrayList;
import java.util.List;

public class _199_rightSideView {
    private int depth = 0;
    private List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return res;
    }
    private void dfs(TreeNode root, int d){
        if(root==null) return; // mid, right, left
        if(d==depth){
            res.add(root.val);
            depth++;
        }
        dfs(root.right, d+1);
        dfs(root.left, d+1);
    }
}
