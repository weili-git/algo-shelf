public class _91_numDecodings {
    public int numDecodings(String s) {// 非常类似上楼梯的题目，每次1或者2.
        // return backtrace(0,s);
        if(s.charAt(0)=='0') return 0;
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=0;i<n;i++){
            dp[i+1] = s.charAt(i)=='0'?0:dp[i];
            if(i>0&&( s.charAt(i-1)=='1' || (s.charAt(i-1)=='2'&&s.charAt(i)<='6'))){
                dp[i+1] += dp[i-1];
            }
        }
        return dp[n];
    }
    private int backtrace(int i, String s){
        // 考虑i字符位置，是吃一个字符还是两个字符，如果到达字符串末尾'\0'，则返回1，表示一种可能的情况
        // 回溯超时
        if(i==s.length()) return 1;
        if(i>s.length()) return 0;
        char ch = s.charAt(i);
        if(ch=='0') return 0;
        if(ch=='1'){
            return backtrace(i+1,s)+backtrace(i+2,s);
        }
        if(ch=='2'){
            if(i+1<s.length()){
                char peek = s.charAt(i+1);
                if(peek>='0' && peek<='6'){
                    return backtrace(i+1,s)+backtrace(i+2,s);
                }else{
                    return backtrace(i+1,s);
                }
            }else{
                return backtrace(i+1,s);
            }
        }
        return backtrace(i+1,s);
    }

}
