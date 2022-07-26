public class _892_surfaceArea {
    public int surfaceArea(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int area = 0;
        int last_side;
        int[] last_front = new int[n];
        for(int i=0;i<m;i++){
            last_side = 0;
            for(int j=0;j<n;j++){
                int cur = grid[i][j];
                if(cur!=0){
                    area += cur*4+2 - ( Math.min(last_side, cur) + Math.min(last_front[j], cur) )*2;
                }
                last_front[j] = cur;
                last_side = cur;
            }
        }
        return area;
    }
}
