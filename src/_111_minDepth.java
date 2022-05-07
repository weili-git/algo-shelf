import java.lang.management.MemoryType;

public class _111_minDepth {
    public int minDepth(TreeNode root) {
        // Be careful about the problems!
        if(root==null) return 0;
        if(root.left==null && root.right==null) {
            return 1;
        }
        else if(root.left==null){
            return minDepth(root.right) + 1;
        }
        else if(root.right==null){
            return minDepth(root.left) + 1;
        }
        else{
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}
