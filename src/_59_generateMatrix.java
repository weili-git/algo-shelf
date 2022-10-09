public class _59_generateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int dir = 0;    // direction
        int num = 1;    // num to be written
        int step = n;   // steps of each loop
        int x=0, y=0;   // coordinate
        int count = 1;  // step decrease with odd count!!!!!
        while(step>0){
            if(dir==0){     // right
                for(int i=0;i<step;i++){
                    mat[x][y] = num;
                    y++;    // move right
                    num++;
                }
                y--;        // go to the next position
                x++;
            }else if(dir==1){   // down
                for(int i=0;i<step;i++){
                    mat[x][y] = num;
                    x++;    // move down
                    num++;
                }
                x--;
                y--;
            }else if(dir==2){   // left
                for(int i=0;i<step;i++){
                    mat[x][y] = num;
                    y--;    // move left
                    num++;
                }
                y++;
                x--;
            }else if(dir==3){   // up
                for(int i=0;i<step;i++){
                    mat[x][y] = num;
                    x--;    // move up
                    num++;
                }
                x++;
                y++;
            }
            if(count%2==1) step--;
            dir = (dir+1)%4;
            count++;
        }
        return mat;
    }
}
