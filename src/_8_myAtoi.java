public class _8_myAtoi {
    public static int myAtoi(String s) {
        // 溢出需要裁剪
        int i=0;
        int n = s.length();
        boolean negative = false;
        int res = 0;
        while(i<n && s.charAt(i)==' ') i++; // check i<n
        if (i == n) {
            //去掉前导空格以后到了末尾了
            return 0;
        }
        if(s.charAt(i)=='-') {
            negative = true;
            i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }
        for (;i<n && s.charAt(i)>='0' && s.charAt(i)<='9';i++){
            int pre = res;
            res = res*10 + (int)(s.charAt(i)-'0');
            if (pre != res / 10) return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        return negative?-res:res;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
}
