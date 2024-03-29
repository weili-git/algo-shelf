public class _1128_numEquivDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        // dominoes 1~9!
        int[] map = new int[100];
        int res = 0;
        for(int i = 0; i < dominoes.length; i++){
            int m = dominoes[i][0];
            int n = dominoes[i][1];
            int k = m > n ? m * 10 + n : n * 10 + m;
            map[k] ++;
        }
        for(int i = 0; i < 100; i++){
            res += map[i] * (map[i] - 1) / 2;
        }
        return res;
    }
}
