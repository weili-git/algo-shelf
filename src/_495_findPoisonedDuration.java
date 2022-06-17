public class _495_findPoisonedDuration {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = duration;
        int n = timeSeries.length;
        for(int i=0;i<n-1;i++){
            sum += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        return sum;
    }
}
