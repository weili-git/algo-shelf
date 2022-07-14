public class _606_tree2str {
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        if(root==null) return "";
        sb.append(root.val);
        dfs(root.left);
        if(root.left==null && root.right!=null){
            sb.append("()");
        }
        dfs(root.right);
        return sb.toString();
    }
    private void dfs(TreeNode root){
        if(root==null) return;
        sb.append("(");
        sb.append(root.val);
        dfs(root.left);
        if(root.left==null && root.right!=null){
            sb.append("()");
        }
        dfs(root.right);
        sb.append(")");
    }
}
