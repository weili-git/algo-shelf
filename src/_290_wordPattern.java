import java.util.HashMap;

public class _290_wordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern==null||s==null) return false;
        String[] string = s.split(" ");
        if(pattern.length()!=string.length) return false;
        HashMap<Character, String> map = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char tmp = pattern.charAt(i);
            if(map.containsKey(tmp)){
                if(!map.get(tmp).equals(string[i])) return false;
            }else{
                if(map.containsValue(string[i])) return false;
                else map.put(pattern.charAt(i),string[i]);
            }
        }
        return true;
    }
}
