public class _313_nthSuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {    // 2 3 5
        int[] count = new int[primes.length];
        long[] dp = new long[n];
        dp[0] = 1;
        for(int i=1;i<n;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=0;j<primes.length;j++){
                dp[i] = Math.min(dp[i], dp[count[j]]*primes[j]);
            }
            for(int k=0;k<primes.length;k++){
                if(dp[i]%primes[k]==0){
                    count[k]++;
                }
            }
        }
        return (int) dp[n-1];
    }
}
