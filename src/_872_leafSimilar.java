import java.util.ArrayList;
import java.util.List;

public class _872_leafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        dfs(root1, leaf1);
        dfs(root2, leaf2);
        if(leaf1.size()!=leaf2.size()) return false;
        for(int i=0;i<leaf1.size();i++){
            if(!leaf1.get(i).equals(leaf2.get(i))) return false;
        }
        return true;
    }
    private void dfs(TreeNode root, List<Integer> leaves){
        if(root==null) return;
        dfs(root.left, leaves);
        if(root.left==null && root.right==null){
            leaves.add(root.val);
        }
        dfs(root.right, leaves);
    }
}
