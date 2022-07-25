import java.util.HashSet;

public class _804_uniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String[] table = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                          ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String word: words){
            for(char ch:word.toCharArray()){
                sb.append(table[ch-'a']);
            }
            set.add(sb.toString());
            sb.delete(0, sb.length());
        }
        return set.size();
    }
}
