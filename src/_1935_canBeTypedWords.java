public class _1935_canBeTypedWords {
    public int canBeTypedWords(String text, String brokenLetters) {
        int[] broken = new int[26];
        for(char ch: brokenLetters.toCharArray()){
            broken[ch-'a'] = 1;
        }
        String[] words = text.split(" ");
        int res = 0;
        boolean isBroken;
        for(String word: words){
            isBroken = false;
            for(char ch: word.toCharArray()){
                if(broken[ch-'a']==1) {
                    isBroken = true;
                    break;
                }
            }
            if(!isBroken) res++;
        }
        return res;
    }
}
