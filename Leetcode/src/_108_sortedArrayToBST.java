public class _108_sortedArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {
        // 利用中间元素作为根节点，构造平衡二叉树。分治算法
        return buildTree(nums, 0, nums.length-1);
        // 结果不一定跟标答一样
    }
    public static TreeNode buildTree(int[] nums, int start, int end){
        if(start<=end){
            int middle = start + (end - start)/2; // avoid overflow
            TreeNode root = new TreeNode(nums[middle]);
            root.left = buildTree(nums, start,middle-1);
            root.right = buildTree(nums, middle+1, end);
            return root;
        }else{
            return null;
        }
    }
}
