import java.util.Stack;

public class _101_isSymmetric {
    public static boolean isSymmetric(TreeNode root) {
        // [9,-42,-42,null,76,76,null,null,13,null,13]

        // [7,
        // -64,-64,
        // -6,-90,-90,-6,
        // 88,-44,68,-65,-76,68,-44,88]

        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        Stack<TreeNode> ss = new Stack<>();
        ss.push(root.left);
        ss.push(root.right);
        while(!ss.isEmpty()){
            TreeNode p = ss.pop();
            TreeNode q = ss.pop();
            if(p.val!=q.val){
                return false;
            }else {
                if(p.left!=null && q.right==null) return false;
                if(p.left==null && q.right!=null) return false;

                if(p.left!=null && q.right!=null){  // important, note that the second condition is trivial
                    ss.push(p.left);
                    ss.push(q.right);
                }

                if(p.right!=null && q.left==null) return false;
                if(p.right==null && q.left!=null) return false;

                if(p.right!=null && q.left!=null){
                    ss.push(p.right);
                    ss.push(q.left);
                }
                // if(p.left==null && p.right==null && q.left==null && q.right==null) return true;      // this condition is false!!!the stack is not empty!!
            }
        }
        return true;
    }
}
