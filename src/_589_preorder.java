import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class _589_preorder {
    private List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null) return res;
        Stack<Node> ss = new Stack<>();
        ss.push(root);
        while(!ss.isEmpty()){
            Node tmp = ss.pop();
            res.add(tmp.val);
            Collections.reverse(tmp.children);
            for(Node child : tmp.children){
                ss.push(child);
            }
        }
        return res;
    }
}
