public class _598_maxCount {
    public int maxCount(int m, int n, int[][] ops) {
        int mm = m;
        int nn = n;
        for(int i=0;i<ops.length;i++){
            mm = Math.min(mm, ops[i][0]);
            nn = Math.min(nn, ops[i][1]);
        }
        return mm*nn;
    }
}
