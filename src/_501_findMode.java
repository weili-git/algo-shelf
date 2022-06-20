import java.util.ArrayList;
import java.util.List;

public class _501_findMode {
    int preVal = 0,curTimes = 0, maxTimes = 0;
    List<Integer> res = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        traverse(root);
        int size = res.size();
        int[] ans = new int[size];
        for(int i = 0; i < size; i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    private void traverse(TreeNode root){   // 不懂
        if(root!=null){
            traverse(root.left);
            if(preVal==root.val){
                curTimes++;
            }else{
                preVal = root.val;
                curTimes = 1;
            }
            if(curTimes==maxTimes){
                res.add(root.val);
            }else if(curTimes>=maxTimes){
                res.clear();
                res.add(root.val);
                maxTimes = curTimes;
            }
            traverse(root.right);
        }
    }
}
