import java.util.LinkedList;
import java.util.List;

public class _257_binaryTreePaths {
    List<String> res;
    StringBuilder sb;
    public List<String> binaryTreePaths(TreeNode root) {
        res = new LinkedList<>();
        sb = new StringBuilder();
        backtrace(root);
        return res;
    }
    private void backtrace(TreeNode root){
        if(root.left==null&&root.right==null) {
            sb.append(root.val);
            res.add(sb.toString());
            sb.delete(sb.length()-(""+root.val).length() ,sb.length());
        }
        else{
            sb.append(root.val);
            sb.append("->");
            if(root.left!=null) backtrace(root.left);
            if(root.right!=null) backtrace(root.right);
            sb.delete(sb.length()-2-(""+root.val).length(), sb.length());
        }
    }

}
