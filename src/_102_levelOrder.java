import java.util.*;

public class _102_levelOrder {
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        DFS(root, 1);
        return new ArrayList<>(map.values());
    }
    private void DFS(TreeNode root, int depth){
        if(root==null) return;
        if(depth>map.size()){
            map.put(depth, new ArrayList<>());
        }
        map.get(depth).add(root.val);
        DFS(root.left, depth+1);
        DFS(root.right, depth+1);
    }
}
