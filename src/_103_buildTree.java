import java.util.Arrays;

public class _103_buildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // postorder最后的元素是根节点
        int i_len = inorder.length;
        int p_len = postorder.length;
        if(i_len == 0 || p_len == 0){
            return null;
        }
        //通过后序序列，查找子树的根节点
        int root_val = postorder[p_len - 1];
        //构造根节点
        TreeNode root = new TreeNode(root_val);
        //遍历中序序列，确定根结点在中序序列中的位置，从而确定左右子树
        int k = 0;
        for (int i = 0; i < i_len; i++) {
            if(root_val == inorder[i]){
                k = i;
                break;
            }
        }
        //分割左右子树，分别创建左右子树的中序、后序序列
        int[] left_in = Arrays.copyOfRange(inorder, 0, k);
        int[] left_post = Arrays.copyOfRange(postorder, 0, k);
        root.left = buildTree(left_in,left_post);

        int[] right_in = Arrays.copyOfRange(inorder, k + 1, i_len);
        int[] right_post = Arrays.copyOfRange(postorder, k, p_len - 1);
        root.right = buildTree(right_in,right_post);
        return root;
        // 效率有待提升
    }
}
