public class _1941_areOccurrencesEqual {
    public boolean areOccurrencesEqual(String s) {
        int[] cnt = new int[26];
        for(char ch: s.toCharArray()){
            cnt[ch-'a']++;
        }
        int occur = 0;
        for(int n: cnt){
            if(n==0 || occur==n) continue;
            if(occur==0) occur = n;
            if(occur!=n) return false;
        }
        return true;

//        int word[26] = {0};
//        for(int i = 0; i < s.size(); i++){
//            word[s[i] - 'a'] ++;
//        }
//
//        int count = word[s[0] - 'a'];
//        for(int i = 0; i < 26; i++){
//            if(word[i] && count!= word[i]) return false;
//        }
//        return true;
    }
}
