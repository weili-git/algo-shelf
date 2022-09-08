import java.util.Arrays;

public class _1025_divisorGame {
    public boolean divisorGame(int n) {
        boolean[] dp = new boolean[n+1];
        Arrays.fill(dp, false);
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                if(i%j==0 && !dp[i-j]){
                    dp[i] = true;
                }
            }
        }
        return dp[n];
        // return n%2;
        // 因为先手为偶数的话，先手只需要让自己每步都保持偶数，那么他可以通过让对手得到的数为奇数，比如偶数-1就是奇数了，对手拿到奇数，那么能整除
        // 的只有奇数，奇数-奇数又回到了偶数，最后先手一定会得到最小的偶数2，然后-1让对手得到1，对手无解，必胜。
    }
}
