public class _463_islandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int perimeter = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    perimeter += 4-island(grid,i-1,j)-island(grid,i+1,j)-island(grid,i,j-1)-island(grid,i,j+1);
                }
            }
        }
        return perimeter;
    }
    private int island(int[][] grid, int i, int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }else{
            return 1;
        }
    }
}
