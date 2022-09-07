import java.util.Arrays;

public class _264_nthUglyNumber {
    public int nthUglyNumber(int n) {
        // 三指针法: 一部分是丑数数组，另一部分是权重2，3，5。下一个丑数，定义为丑数数组中的数乘以权重，所得的最小值。
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0; // 应该使用2, 3, 5的丑数索引值
        // 正常来说：对于0, 1, ... , l-1的丑数，找到第l个需要对前面所有的数乘2， 3， 5。但是我们可以记录上一次用了2， 3， 5的索引值，下次直接找对应下一个就行
        for(int i=1;i<n;i++){
            dp[i] = Math.min(dp[i2]*2, Math.min(dp[i3]*3, dp[i5]*5));
            if(dp[i]==dp[i2]*2) i2++;
            if(dp[i]==dp[i3]*3) i3++;
            if(dp[i]==dp[i5]*5) i5++;
        }
        return dp[n-1];
    }
}
