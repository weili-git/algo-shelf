public class _110_isBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(maxDepth(root.left)-maxDepth(root.right)) < 2;
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    // needs improvement
}
