public class _671_findSecondMinimumValue {
    public int findSecondMinimumValue(TreeNode root) {
        // 寻找左右子树的最小值
        // 如果都大于根节点，那么去两者的较小值
        // 否则，
        return myfun(root, root.val);
    }

    public int myfun(TreeNode root, int val) {
        if (root == null) {
            return -1;
        }
        if (root.val > val) {
            return root.val;
        }
        int l = myfun(root.left, val);
        int r = myfun(root.right, val);
        if (l > val && r > val) {
            return Math.min(l,r);
        }
        return Math.max(l,r);   // 有一个节点是子节点相等的情况
    }
}
