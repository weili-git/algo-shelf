public class _1876_countGoodSubstrings {
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        for(int i=2;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)||s.charAt(i)==s.charAt(i-2)||s.charAt(i-1)==s.charAt(i-2)) continue;
            cnt++;
        }
        return cnt;
    }
}
