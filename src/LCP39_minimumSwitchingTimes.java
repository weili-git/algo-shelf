public class LCP39_minimumSwitchingTimes {
    public int minimumSwitchingTimes(int[][] source, int[][] target) {
        int[] cnt = new int[10001];
        for(int i=0;i<source.length;i++){
            for(int j=0;j<source[0].length;j++){
                cnt[source[i][j]]++;
                cnt[target[i][j]]--;
            }
        }
        int diff = 0;
        for(int num:cnt){
            diff += Math.abs(num);
        }
        return diff/2;
    }
}
