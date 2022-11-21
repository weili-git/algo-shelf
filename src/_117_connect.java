import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _117_connect {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                Node t = q.poll();
                t.next = q.isEmpty()||i==n-1?null:q.peek();
                if(t.left!=null) q.offer(t.left);
                if(t.right!=null) q.offer(t.right);
            }
        }
        return root;
    }
}
