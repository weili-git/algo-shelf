import java.util.HashMap;
import java.util.Map;

public class _383_canConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 数组空间复杂度比哈希更优
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            if(map.containsKey(ch)) map.replace(ch, map.get(ch)+1);
            else map.put(ch, 1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>0) map.replace(ch, map.get(ch)-1);
            else return false;
        }
        return true;
    }
}
