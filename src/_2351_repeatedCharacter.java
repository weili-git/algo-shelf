public class _2351_repeatedCharacter {
    public char repeatedCharacter(String s) {
        int[] cnt = new int[26];
        for(char ch:s.toCharArray()){
            cnt[ch-'a']++;
            if(cnt[ch-'a']==2) return ch;
        }
        return s.charAt(0);
    }
}
