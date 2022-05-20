import java.util.ArrayList;
import java.util.Stack;

public class _114_flatten {
    Stack<TreeNode> next = new Stack<>();   // 记得修改左指针为右
    public void flatten(TreeNode root) {
        if(root==null) return;
        if(root.left==null) {
            if(root.right==null&&!next.isEmpty()){
                root.right = next.pop();
                flatten(root.right);
            }
            else{
                flatten(root.right);
            }
        }
        else {
            if(root.right!=null) next.push(root.right);
            //
            root.right = root.left;
            root.left = null;
            //
            flatten(root.right);
        }
    }
}
