import java.util.HashMap;

public class _205_isIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hash = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hash.containsKey(s.charAt(i))){
                if(hash.containsValue(t.charAt(i))) return false;   //
                hash.put(s.charAt(i), t.charAt(i));
            }else{
                if(hash.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // No two characters may map to the same character
        System.out.println(isIsomorphic("abba", "abba"));
    }
}
