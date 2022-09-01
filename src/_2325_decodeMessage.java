import java.util.Arrays;

public class _2325_decodeMessage {
    public String decodeMessage(String key, String message) {
        int[] table = new int[26];
        int order = 1;
        for(char ch:key.toCharArray()){
            if(ch<'a'||ch>'z') continue;
            if(table[ch-'a']==0){
                table[ch-'a'] = order++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:message.toCharArray()){
            if(ch<'a'||ch>'z') {
                sb.append(ch);
                continue;
            }
            sb.append((char)(table[ch-'a']+'a'-1));
        }
        return sb.toString();
    }
}
