public class _171_titleToNumber {
    public static int titleToNumber(String columnTitle) {
        int res = 0;
        for(int i=0;i<columnTitle.length()-1;i++){
            res += ((int)columnTitle.charAt(i) - (int)'A') + 1;
            res *= 26;  // overflow
        }
        res += ((int)columnTitle.charAt(columnTitle.length()-1) - (int)'A') + 1;
        return res;
    }

    public static void main(String[] args) {
        String str = "ZY";
        System.out.println(titleToNumber(str));
    }
}
