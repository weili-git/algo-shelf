import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class _94_inorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        Stack<TreeNode> ss = new Stack<>();
//        TreeNode cur = root;
//        while(cur!=null || !ss.isEmpty()){
//            if(cur!=null){
//                ss.push(cur);
//                cur = cur.left;
//            }else {
//                cur = ss.pop();
//                list.add(cur.val);
//                cur=cur.right;
//            }
//        }
//        return list;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> ss = new Stack<>();
        while(root!=null){
            ss.push(root);
            root = root.left;
        }
        while(!ss.isEmpty()){
            TreeNode tmp = ss.pop();
            list.add(tmp.val);
            tmp = tmp.right;
            while(tmp!=null){
                ss.push(tmp);
                tmp = tmp.left;
            }
//            TreeNode tmp = ss.pop();
//            if(tmp.left!=null) {   // case 2: tmp is right subtree's middle node, but we repeatedly do the process of root node. dead loop!
//                ss.push(tmp);
//                ss.push(tmp.left);
//                continue;
//            }
//            list.add(tmp.val);  // case 1: tmp is the leftmost node
//            if(tmp.right!=null) {
//                ss.push(tmp.right);
//            }
        }
        return list;
    }

    public static void main(String[] args) {
        // recursive ??
    }
}
