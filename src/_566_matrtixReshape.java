public class _566_matrtixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // 4*3 -> 3*4
        int m = mat.length;
        int n = mat[0].length;
        if(m==r && n==c) return mat;
        if(m*n==r*c){
            int[][] res = new int[r][c];
            for(int i=0;i<m*n;i++){
                res[i/c][i%c] = mat[i/n][i%n]; // !
            }
            return res;
        }
        return mat;
    }
}
