public class _200_numIslands {
    public int numIslands(char[][] grid) {
        int num = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    infect(grid, i, j);
                    num++;
                }
            }
        }
        return num;
    }
    private void infect(char[][] grid, int i, int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!='1') return;
        grid[i][j] = '2';
        infect(grid, i+1,j);
        infect(grid, i-1,j);
        infect(grid,i,j+1);
        infect(grid,i,j-1);
    }
}
