import java.util.List;

public class _139_wordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
//        if(s==null||s.equals("")) return true;
//        for(int i=0;i<s.length();i++){
//            if(wordDict.contains(s.substring(0,i+1))){
//                if(i+1>=s.length()) return true;
//                else if(wordBreak(s.substring(i+1,s.length()), wordDict)) return true;
//            }
//        }
//        return false;
/*        time-out        */

        // 可以类比于背包问题
        int n = s.length();
        // memo[i] 表示 s 中以 i - 1 结尾的字符串是否可被 wordDict 拆分
        boolean[] memo = new boolean[n + 1];
        memo[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (memo[j] && wordDict.contains(s.substring(j, i))) {
                    memo[i] = true;
                    break;
                }
            }
        }
        return memo[n];
    }
}

