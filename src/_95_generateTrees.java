import java.util.ArrayList;
import java.util.List;

public class _95_generateTrees {
    public List<TreeNode> generateTrees(int n) {
        // dp[i] = dp[i-1]*2 + dp[i-2]*dp[1] + dp[i-3]*dp[2] + ...
        return generateTrees(1, n);
    }
    private List<TreeNode> generateTrees(int start, int end){
        List<TreeNode> res = new ArrayList<>();
        if(start>end) {
            res.add(null);
            return res;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> subLeftTree = generateTrees(start, i-1);
            List<TreeNode> subRightTree = generateTrees(i+1, end);
            for(TreeNode left : subLeftTree){
                for(TreeNode right : subRightTree){
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    res.add(node);
                }
            }
        }
        return res;
    }
}
