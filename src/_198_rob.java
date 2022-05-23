public class _198_rob {
    public int rob(int[] nums) {    // [2, 1, 1, 2]
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
            if(i>=3){// key point
                dp[i] = Math.max(dp[i], dp[i-3]+nums[i]);
            }
        }
        return dp[n-1];
    }
}
// dp[i] = max(dp[i-2]+nums[i], dp[i-1]) 需要初始化dp[1] = max(nums[0], nums[1])