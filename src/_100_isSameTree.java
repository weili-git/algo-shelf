import java.util.Stack;

public class _100_isSameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;     // check!
        if(p==null || q==null) return false;
        if(p.val==q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
