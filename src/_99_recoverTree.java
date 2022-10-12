public class _99_recoverTree {
    private TreeNode pre,t1,t2;
    public void recoverTree(TreeNode root) {
        // exactly one swap!!
        dfs(root);
        int tmp = t1.val;
        t1.val = t2.val;
        t2.val = tmp;
    }
    private void dfs(TreeNode root){ // in-order traverse
        if(root==null) return;
        dfs(root.left);
        if(pre!=null && root.val<pre.val){// 3, 2, 1 or 2, 1
            if(t1==null) t1 = pre;  // the start of inverse?
            t2 = root;
        }
        pre = root;
        dfs(root.right);
    }
}
