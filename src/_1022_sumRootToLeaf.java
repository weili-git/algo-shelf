public class _1022_sumRootToLeaf {
    private int sum = 0;
    private int path = 0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root);
        return sum;
    }
    private void dfs(TreeNode root){
        if(root==null) return;
        path = root.val==0?path<<1:(path<<1)+1;
        dfs(root.left);
        if(root.left==null&&root.right==null){
            sum += path;
        }
        dfs(root.right);
        path = path>>1;
    }
}
