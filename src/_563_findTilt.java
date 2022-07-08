public class _563_findTilt {
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        int tilt = Math.abs(TSum(root.left) - TSum(root.right));
        return tilt + findTilt(root.left) + findTilt(root.right);
    }
    private int TSum(TreeNode root){
        if(root==null) return 0;
        return TSum(root.left)+TSum(root.right)+root.val;
    }
}
