public class _2068_checkAlmostEquivalent {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] cnt = new int[26];
        for(char ch: word1.toCharArray()){
            cnt[ch-'a']++;
        }
        for(char ch: word2.toCharArray()){
            cnt[ch-'a']--;
        }
        for(int n: cnt){
            if(Math.abs(n)>3) return false;
        }
        return true;
    }
}
