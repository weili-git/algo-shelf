import java.util.Arrays;

public class _300_lengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];  // 以dp[i]结尾的子串递增序列长度
        Arrays.fill(dp, 1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }
        }
        int max = dp[0];
        for(int i=1;i<n;i++){   // 找出每个结尾字串的最大长度
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
// 1,3,6,7,9,4,10,5,6
// 1 2 3 4 5 5 6  6