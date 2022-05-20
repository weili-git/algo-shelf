import com.sun.source.tree.Tree;

import java.util.Arrays;

public class _105_buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0) return null;
        // [0][left][right] && [left][i][right]
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=0;i<preorder.length;i++){
            if(preorder[0]==inorder[i]){
                root.left = buildTree(Arrays.copyOfRange(preorder,1,i+1), Arrays.copyOfRange(inorder, 0, i));
                root.right = buildTree(Arrays.copyOfRange(preorder, i+1, preorder.length), Arrays.copyOfRange(inorder, i+1, preorder.length));
                break;
            }
        }
        return root;
    }
}


//if(preorder.length==0||inorder.length==0) return null;
//
//        TreeNode root = new TreeNode (preorder[0]);
//        for(int i=0;i<preorder.length;i++){
//        if(preorder[0]==inorder[i]){
//        root.left=buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
//        root.right=buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
//        break;
//        }
//        }
//        return root;