public class _98_isValidBST {
    double last = -Double.MAX_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(isValidBST(root.left)){
            if(last<root.val){  // 非常巧妙
                last  = root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }
}

//
//    public boolean isValidBST(TreeNode root) {
//        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
//    }
//
//    public boolean validate(TreeNode node, long min, long max) {
//        if (node == null) {
//            return true;
//        }
//        if (node.val <= min || node.val >= max) {
//            return false;
//        }
//        return  validate(node.left, min, node.val) && validate(node.right, node.val, max);
//    }