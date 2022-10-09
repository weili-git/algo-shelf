import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _993_isCousins {
    private int xpar, xdep, ypar, ydep;
    public boolean isCousins(TreeNode root, int x, int y) {
        // DFS, with different parents
        dfs(root.left, 1, x, y, root.val);
        dfs(root.right, 1, x, y, root.val);
        return (xpar!=ypar) && (xdep==ydep);
    }
    private void dfs(TreeNode root, int dep, int x, int y, int par){
        if(root==null) return;
        if(root.val==x){
            xpar = par;
            xdep = dep;
        }
        else if(root.val==y){
            ypar = par;
            ydep = dep;
        }else{
            dfs(root.left, dep+1, x, y, root.val);
            dfs(root.right, dep+1, x, y, root.val);
        }
    }
}
