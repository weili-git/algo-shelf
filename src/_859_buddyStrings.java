public class _859_buddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int diff = 0;
        boolean hash_two = false;
        int[] count = new int[26];
        char a = '0', b = '0';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==goal.charAt(i)){
                count[s.charAt(i)-'a']++;
            }else{
                if(diff<2){
                    diff++;
                    if(diff==1){
                        a = s.charAt(i);
                        b = goal.charAt(i);
                    }else{
                        if(a!=goal.charAt(i) || b!=s.charAt(i)){
                            return false;
                        }
                    }
                }else{
                    return false;
                }
            }
        }
        for(int num: count){
            if(num>=2) {
                hash_two = true;
                break;
            }
        }
        if(diff==0 && hash_two) return true;
        return diff == 2;
    }
}
