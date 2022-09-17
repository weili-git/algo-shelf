public class _1175_numPrimeArrangements {
    private final int[] primeCounts = new int[]{
                0, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 11, 11, 11, 11,
                11, 11, 12, 12, 12, 12, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 17,
                17, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 20, 20, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 23, 23,
                23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25};

    public int numPrimeArrangements(int n) {
        long count = 1;
        for (int i = 1; i <= primeCounts[n - 1]; i++) {
            count = count * i % 1000000007;
        }
        for (int i = 1; i <= n - primeCounts[n - 1]; i++) {
            count = count * i % 1000000007;
        }
        return (int) count;
    }
}
