public class _1748_sumOfUnique {
    public int sumOfUnique(int[] nums) {
        int[] cnt = new int[101];
        for(int n: nums){
            cnt[n]++;
        }
        int sum = 0;
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]==1) sum+=i;
        }
        return sum;
    }
}
