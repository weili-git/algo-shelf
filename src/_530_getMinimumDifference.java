public class _530_getMinimumDifference {
    private int result = Integer.MAX_VALUE;
    private TreeNode preNode = null;
    public int getMinimumDifference(TreeNode root) {
        getMin(root);
        return result;
    }
    private void getMin(TreeNode root){
        if(root==null){
            return;
        }
        getMin(root.left);
        if(preNode!=null){
            result = Math.min(Math.abs(root.val-preNode.val), result);
        }
        preNode = root;
        getMin(root.right);
    }
}
