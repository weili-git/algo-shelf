public class _1275_tictactoe {
    public static String tictactoe(int[][] moves) {
        int[][] square = new int[3][3];
        int i;
        for(i=0;i<moves.length;i++){
            square[moves[i][0]][moves[i][1]] = i%2==0?1:-1;
//            for(int ii=0;ii<3;ii++){
//                for(int jj=0;jj<3;jj++){
//                    System.out.print(square[ii][jj]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
            for(int m=0;m<3;m++){
                if(square[m][0]!=0 && square[m][0]==square[m][1] && square[m][1]==square[m][2]){
                    return square[m][0]==1?"A":"B";
                }
                if(square[0][m]!=0 && square[0][m]==square[1][m] && square[1][m]==square[2][m]){
                    return square[0][m]==1?"A":"B";
                }
            }
            if(square[0][0]!=0 && square[0][0]==square[1][1] && square[1][1]==square[2][2]){
                return square[0][0]==1?"A":"B";
            }
            if(square[2][0]!=0 && square[2][0] == square[1][1] && square[1][1]==square[0][2]){
                return square[2][0]==1?"A":"B";
            }
        }
        if(moves.length==9) return "Draw";
        return "Pending";
    }

    public static void main(String[] args) {
        int[][] moves = {{0,0}, {2,0}, {1,1}, {2, 1}, {2, 2}};
        System.out.println(tictactoe(moves));
    }
}
