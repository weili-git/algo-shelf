public class _806_numberOfLines {
    public int[] numberOfLines(int[] widths, String s) {
        int ln = 1;
        int len = 100;
        for(char ch:s.toCharArray()){
            if(len>=widths[ch-'a']){
                len -= widths[ch-'a'];
            }else{
                ln++;
                len = 100 - widths[ch-'a'];
            }
        }
        return new int[]{ln,100-len};
    }
}
