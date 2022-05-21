public class _617_mergeTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2; // 如果t1为空，合并之后就应该是t2
        if (root2 == null) return root1; // 如果t2为空，合并之后就应该是t1
        // 修改了t1的数值和结构
        root1.val += root2.val;                               // 中
        root1.left = mergeTrees(root1.left, root2.left);      // 左
        root1.right = mergeTrees(root1.right, root2.right);   // 右
        return root1;
    }
}
