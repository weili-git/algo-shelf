import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _637_averageOfLevels {
    List<Double> res = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        bfs(root);
        return res;
    }
    private void bfs(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        double avg = 0;
        int num = 0;        // record of next_num
        int next_num = 1;   // num per level
        int count;          // dividend
        while(!q.isEmpty()){
            count = next_num;
            while(!q.isEmpty() && next_num>0){
                TreeNode tmp = q.poll();
                if(tmp.left!=null){
                    q.add(tmp.left);
                    num++;
                }
                if(tmp.right!=null){
                    q.add(tmp.right);
                    num++;
                }
                avg += tmp.val;
                next_num--;
            }
            avg = avg/count;
            res.add(avg);
            next_num = num;
            num = 0;
            avg = 0;
        }
    }
}


//class Solution {
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> res = new ArrayList<>();
//        if (root == null) return res;
//        Queue<TreeNode> list = new LinkedList<>();
//        list.add(root);
//        while (list.size() != 0){
//            int len = list.size();
//            double sum = 0;
//            for (int i = 0; i < len; i++){
//                TreeNode node = list.poll();
//                sum += node.val;
//                if (node.left != null) list.add(node.left);
//                if (node.right != null) list.add(node.right);
//            }
//            res.add(sum/len);
//        }
//        return res;
//    }
//}