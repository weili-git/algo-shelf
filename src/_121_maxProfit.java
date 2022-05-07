public class _121_maxProfit {
    public static int maxProfit(int[] prices) {
//        int mp = 0;
//        for(int i=1;i<prices.length;i++){
//            if(prices[i]>prices[i-1]){
//                mp += prices[i] - prices[i-1];
//            }
//        }
//        return mp;

// time-out
//        int mp = 0;
//        int n = prices.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=i+1;j<n;j++){
//                mp = Math.max(mp, prices[j]-prices[i]);
//            }
//        }
//        return mp;

        if(prices.length <= 1)
            return 0;
        int min = prices[0], max = 0;
        for(int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;

    }
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4}; // 只能买入和卖出一次
        System.out.println(maxProfit(nums));
    }
}
