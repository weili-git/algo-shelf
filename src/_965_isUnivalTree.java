public class _965_isUnivalTree {
    private boolean uni = true;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        dfs(root, root.val);
        return uni;
    }
    private void dfs(TreeNode root, int val){
        if(root==null) return;
        dfs(root.left, val);
        if(root.val!=val) {
            uni = false;
            return;
        }
        dfs(root.right, val);
    }
}
