public class _832_flipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][n-j-1] = 1 - image[i][j];
            }
        }
        return res;
    }
}
