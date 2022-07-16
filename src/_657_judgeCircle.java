public class _657_judgeCircle {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char ch:moves.toCharArray()){
            switch (ch){
                case 'U':
                    y+=1;
                    break;
                case 'D':
                    y-=1;
                    break;
                case 'L':
                    x-=1;
                    break;
                case 'R':
                    x+=1;
                    break;
            }
        }
        return x==0&&y==0;
    }
}
