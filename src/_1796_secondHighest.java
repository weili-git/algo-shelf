public class _1796_secondHighest {
    public int secondHighest(String s) {
        int[] num = new int[10];
        for(char ch: s.toCharArray()){
            if(ch>='0' && ch<='9') num[ch-'0'] = 1;
        }
        int m1 = -1, m2 = -1;
        for(int n=0;n<num.length;n++){
            if(num[n]==1){
                if(n>m1){
                    m2 = m1;
                    m1 = n;
                }else if(n>m2){
                    m2 = n;
                }
            }
        }
        return m2;
    }
}
