import java.util.ArrayList;
import java.util.Arrays;

public class _279_numSquares {
    public int numSquares(int n) {
        int num = (int) Math.sqrt(n);
        if(num*num==n) return 1;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1;i<=num;i++){
            nums.add(i*i);
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        // 完全背包问题
        for(int i=0;i<nums.size();i++){
            for(int j=nums.get(i);j<=n;j++){
                if(dp[j-nums.get(i)]!=Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j], dp[j-nums.get(i)]+1);
                }
            }
        }
        return dp[n];
    }
}
