public class _338_countBits {
    public int[] countBits(int n){
        int[] dp = new int[n+1];
        for(int i=0;i<=n/2;i++){
            dp[2*i] = dp[i];
            if(i*2+1<=n) dp[2*i+1] = dp[i]+1;
        }
        return dp;

    }
}
