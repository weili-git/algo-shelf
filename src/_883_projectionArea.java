public class _883_projectionArea {
    public int projectionArea(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int top=0, front=0, side=0;
        int side_max;
        int[] front_max = new int[n];
        for(int i=0;i<m;i++){
            side_max = 0;
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    top++;
                    side_max = Math.max(side_max, grid[i][j]);
                    front_max[j] = Math.max(front_max[j], grid[i][j]);
                }
            }
            side += side_max;
        }
        for(int num:front_max){
            front+=num;
        }
        return top+front+side;
    }
}
