public class _2283_digitCount {
    public boolean digitCount(String num) {
        int[] cnt = new int[10];
        char ch;
        for(int i=0;i<num.length();i++){
            ch = num.charAt(i);
            cnt[i] += (ch-'0'); // 第i位的数字加上digit
            cnt[ch-'0']--;      // 第digit的数字-1
        }
        boolean res = true;
        for(int i=0;i<10;i++){
            if(cnt[i]!=0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
