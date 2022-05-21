import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class _116_connect {
    public Node connect(Node root) {
        if(root==null) return null;
        if(root.left!=null){
            root.left.next = root.right;
            if(root.next!=null) root.right.next = root.next.left;   // 巧妙
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
