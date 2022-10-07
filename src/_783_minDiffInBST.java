public class _783_minDiffInBST {
    private TreeNode pre = null;
    private int res = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return res;
    }
    private void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        if(pre!=null){
            res = Math.min(res, root.val-pre.val);
        }
        pre = root;
        dfs(root.right);
    }
}
