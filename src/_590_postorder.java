import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _590_postorder {
    private List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        _post(root);
        return res;
    }
    private void _post(Node root){
        if(root==null) return;
        for(Node a : root.children){
            _post(a);
        }
        res.add(root.val);
    }
}
