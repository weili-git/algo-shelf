public class _309_maxProfit {
    public int maxProfit(int[] prices) {
        // 有问题
//        int n = prices.length;
//        int[] dp = new int[n+1];    // dp[i]：第i次选择buy时的最大利润(递减时) or 第i轮最大利润(递增时)
//        int i=1;
//        while(i<n && prices[i]>prices[i-1]){   // 增长了，昨天肯定不是sell的时候，直接把利润吃掉
//            // dp[i] = dp[i-1] + prices[i] - prices[i-1];
//            dp[i+1] = dp[i] + prices[i] - prices[i-1];
//            i++;
//        }
//        for(;i<n;i++){
//            if(prices[i]<prices[i]){    // 下跌了，不可能这一天sell，因为昨天是更好的时机。要么buy，要么啥都不做 cool down
//                // if not buy -> dp[i-1]也许更大，我们最终求dp.max
//                // if buy -> dp[i] = max(dp[0]...dp[i-2])
//                for(int j=0;j<i-1;j++){
//                    // dp[i] = Math.max(dp[i], dp[j]);
//                    dp[i+1] = Math.max(dp[i+1], dp[j+1]);
//                }
//            }else if(prices[i]>prices[i-1]){  // 上涨了，从之前找比当前价格更低的点作为买入点
//                for(int j=0;j<i;j++){
//                    if(prices[i]>prices[j]){
//                        if(j>0){
//                            // dp[i] = Math.max(dp[i], prices[i]-prices[j] + dp[j-2]);
//                            dp[i+1] = Math.max(dp[i+1], prices[i]-prices[j] + dp[j-1]);
//                        }else{
//                            // dp[i] = Math.max(dp[i], prices[i]-prices[j] + 0);
//                            dp[i+1] = Math.max(dp[i+1], prices[i]-prices[j] + 0);
//                        }
//                    }
//                }
//            }
//        }
//        int max = dp[0];
//        for(int ii=1;ii<=n;ii++){
//            max = Math.max(max, dp[ii]);
//        }
//        return max;


//        sell[i]表示截至第i天，最后一个操作是卖时的最大收益；
//        buy[i]表示截至第i天，最后一个操作是买时的最大收益；
//        cool[i]表示截至第i天，最后一个操作是冷冻期时的最大收益；
//        递推公式：
//        sell[i] = max(buy[i-1]+prices[i], sell[i-1]) (第一项表示第i天卖出，第二项表示第i天冷冻)
//        buy[i] = max(cool[i-1]-prices[i], buy[i-1]) （第一项表示第i天买进，第二项表示第i天冷冻）
//        cool[i] = max(sell[i-1], buy[i-1], cool[i-1])

        if (prices == null || prices.length < 2) {
            return 0;
        }
        int[][] dp = new int[prices.length][2];

        // bad case
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[1][0] = Math.max(dp[0][0], dp[0][1] + prices[1]);
        dp[1][1] = Math.max(dp[0][1], -prices[1]);

        for (int i = 2; i < prices.length; i++) {
            // dp公式
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
        }

        return dp[prices.length - 1][0];
    }
}