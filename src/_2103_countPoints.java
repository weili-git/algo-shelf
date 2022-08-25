public class _2103_countPoints {
    public int countPoints(String rings) {
        int n = rings.length();
        int[][] cnt = new int[10][3];
        for(int i=0;i<n;i+=2){
            char ch = rings.charAt(i);
            int[] ints = cnt[rings.charAt(i + 1) - '0'];
            switch (ch){
                case 'R':
                    ints[0]=1;
                    break;
                case 'G':
                    ints[1]=1;
                    break;
                case 'B':
                    ints[2]=1;
                    break;
            }
        }
        int res = 0;
        for(int[] num:cnt){
            if(num[0]==1&&num[1]==1&&num[2]==1) res++;
        }
        return res;
    }
}
