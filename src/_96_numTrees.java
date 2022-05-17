import java.util.Arrays;

public class _96_numTrees {
    //  结题思路：假设n个节点存在二叉排序树的个数是G(n)，1为根节点，2为根节点，...，n为根节点，
    //  当1为根节点时，其左子树节点个数为0，右子树节点个数为n-1，同理当2为根节点时，其左子树节点个数为1，右子树节点为n-2，
    //  所以可得G(n) = G(0)*G(n-1)+G(1)*(n-2)+...+G(n-1)*G(0)
    public int numTrees(int n) {
        if(n==1) return 1;
        int[] g = new int[n+1];
        Arrays.fill(g, 0);
        g[0] = 1;
        g[1] = 1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                g[i] += g[j]*g[i-j-1];
            }
        }
        return g[n];
    }
}
