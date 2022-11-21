public class _129_sumNumbers {
    private int sum = 0;
    private int path = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root);
        return sum;
    }
    private void dfs(TreeNode root){
        if(root==null) return;
        if(root.left==null&&root.right==null) {// leaf
            sum+=path+root.val;
            return;
        }
        path+=root.val;
        path*=10;
        dfs(root.left);
        dfs(root.right);
        path/=100;
        path*=10;
    }
}
