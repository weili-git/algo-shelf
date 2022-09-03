import java.util.Stack;

public class LCP44_numColor {
    public int numColor(TreeNode root) {
        int[] cnt = new int[1001];
        Stack<TreeNode> ss = new Stack<>();
        ss.push(root);
        while(!ss.isEmpty()){
            TreeNode t = ss.pop();
            cnt[t.val] = 1;
            if(t.left!=null) ss.push(t.left);
            if(t.right!=null) ss.push(t.right);
        }
        int res = 0;
        for(int i=0;i<1001;i++){
            if(cnt[i]==1) res++;
        }
        return res;
    }
}
