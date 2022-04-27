import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _145_postorderTraversal {
    public static List<Integer> res = new ArrayList<>();    // 多个测试阳历，不要写static
    public static List<Integer> postorderTraversal(TreeNode root) {
        // 遍历完子树会回到根节点，可能产生死循环！！！
        if(root==null) return res;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        res.add(root.val);
        return res;
    }
}
