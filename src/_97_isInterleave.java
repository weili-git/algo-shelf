public class _97_isInterleave {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()) return false;
//        return backtrace(s1, s2, s3, 0, 0);
        int n1 = s1.length(), n2 = s2.length();
        boolean[][] dp = new boolean[n1+1][n2+1];
        dp[0][0] = true;
        for(int i=1;i<=n1;i++){
            dp[i][0] = dp[i-1][0]&&(s1.charAt(i-1)==s3.charAt(i-1));
        }
        for(int i=1;i<=n2;i++){
            dp[0][i] = dp[0][i-1]&&(s2.charAt(i-1)==s3.charAt(i-1));
        }
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                dp[i][j] = dp[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1) || dp[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1);
            }
        }
        return dp[n1][n2];
    }
    private boolean backtrace(String s1, String s2, String s3, int p1, int p2){ // time-out
        if(p1==s1.length() && p2==s2.length()) return true;
        if(p1>s1.length() || p2>s2.length()) return false;
        boolean res = false;
        if(p1<s1.length() && s1.charAt(p1)==s3.charAt(p1+p2)){
            res = res || backtrace(s1, s2, s3, p1+1, p2);
        }
        if(p2<s2.length() && s2.charAt(p2)==s3.charAt(p1+p2)){
            res = res || backtrace(s1, s2, s3, p1, p2+1);
        }
        return res;
    }
}
