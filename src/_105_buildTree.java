public class _105_buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||preorder.length==0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=0;i<preorder.length;i++){
            if(preorder[0]==inorder[i]){
                root.left = new TreeNode()
            }
        }
        return root;
        // in progress
    }
}
