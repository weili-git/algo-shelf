import java.util.Arrays;

public class _1646_getMaximumGenerated {
    public int getMaximumGenerated(int n) {
        if(n<=1) return n;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int max = Integer.MIN_VALUE;
        for(int i=2;i<=n;i++){
            if(i%2==0){
                dp[i] = dp[i/2];
            }else{
                dp[i] = dp[i/2] + dp[i/2+1];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
