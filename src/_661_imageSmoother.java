public class _661_imageSmoother {
    public int[][] imageSmoother(int[][] img) {
        // round down 四舍五入
        int row = img.length;
        int col = img[0].length;
        int[][] res = new int[row][col];
        int sum,cnt;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum = 0;
                cnt = 0;
                for(int m=-1;m<=1;m++){
                    if(i+m<0||i+m>=row) continue;
                    for(int n=-1;n<=1;n++){
                        if(j+n<0||j+n>=col) continue;
                        cnt++;
                        sum += img[i+m][j+n];
                    }
                }
                res[i][j] = sum/cnt; // round down
            }
        }
        return res;
    }
}
