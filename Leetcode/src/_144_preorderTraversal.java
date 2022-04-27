import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _144_preorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> ss = new Stack<>();
        while (root!=null){
            res.add(root.val);
            if(root.right!=null) ss.push(root.right);
            if(root.left!=null) ss.push(root.left);
            if(!ss.isEmpty()) {
                root = ss.pop();
            }else{
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }

}
