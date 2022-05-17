public class _62_uniquePaths {
//    int num;
//    public int uniquePaths(int m, int n) {
//        num = 0;
//        helper(0, 0, m, n);
//        return num;
//    }
//    private void helper(int i, int j, int m, int n){
//        if(i>=m||j>=n) return;
//        else if(i==m-1&&j==n-1){
//            num++;
//            return;
//        }else{
//            helper(i+1, j, m, n);
//            helper(i, j+1, m, n);
//        }
//    }
    public int uniquePaths(int m, int n) {
        long res = 1;
        for(int x=n, y=1;y<m;++x, ++y){
            res = res * x / y;
        }
        return (int)res;
    }
    public int uniquePaths_dp(int m, int n) {//经典dp
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)   // 到这两条直线上的任何点，只有唯一一条路
                    dp[i][j] = 1;
                else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // 只能从上面，或者左边来到当前这个节点。
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
