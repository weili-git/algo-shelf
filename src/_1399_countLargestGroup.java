public class _1399_countLargestGroup {
    public int countLargestGroup(int n) {
        // 十进制1~9999，稍加思考
        int[]cnt=new int[37];
        int max_sum=0;
        for (int i = 1; i <= n; i++) {
            int index=getNumSum(i);
            cnt[index]++;
            max_sum=Math.max(cnt[index],max_sum);
        }
        int ans=0;
        for (int i = 36; i >0 ; i--) {
            if(cnt[i]==max_sum){
                ans++;
            }
        }
        return ans;
    }

    private int getNumSum(int n){
        int sum=0;
        while (n>=10){
            sum+=n%10;
            n=n/10;
        }
        sum+=n;
        return sum;
    }
}
