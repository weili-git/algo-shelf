public class _953_isAlienSorted {
    int[] alphabet = new int[26];
    public boolean isAlienSorted(String[] words, String order) {

        for(int i=0;i<26;i++){
            alphabet[order.charAt(i)-'a'] = i;
        }
        for(int i = 0;i < words.length - 1;i++)
            if(compare(words[i], words[i + 1]) > 0) return false;
        return true;
    }
    public int compare(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int min = Math.min(n1, n2);

        for (int i = 0; i < min; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                return alphabet[c1 - 'a'] - alphabet[c2 - 'a'];
            }
        }
        return n1 - n2;
    }
}
