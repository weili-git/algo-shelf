import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _120_minimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if(n==1) return triangle.get(0).get(0);
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = triangle.get(0).get(0);
        for(int i=1;i<triangle.size();i++){
            for(int j=0;j<=i;j++){
                dp[i][j] = Math.min(triangle.get(i-1).get(j), dp[i][j]);
                if(j>0) dp[i][j] = Math.max(triangle.get(i-1).get(j-1), dp[i][j]);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(dp[n-1][i], min);
        }
        return min;

        // in progress
    }
}
