import java.util.Arrays;

public class _213_rob {
    public int rob(int[] nums) {
        // 1. 第1个和第n个不能同时抢
        // 2. 如果不抢第1个，那个从第2到第n个可以同时抢首尾的。
        // 3. 问题转化为两个子问题
        int len = nums.length;
        if(len==1) return nums[0];
        return Math.max(
                myRob(Arrays.copyOfRange(nums,0, len-1)),
                myRob(Arrays.copyOfRange(nums, 1, len))
        );
    }
    private int myRob(int[] nums){
        int n = nums.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i=2;i<=n;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]); // 要么选第i-1个元素，要么不选
        }
        return dp[n];
    }
}
