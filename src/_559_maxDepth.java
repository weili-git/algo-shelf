public class _559_maxDepth {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int d = 0;
        for(int i=0;i<root.children.size();i++){
            d = Math.max(d, maxDepth(root.children.get(i)));
        }
        return d+1;
    }
}
