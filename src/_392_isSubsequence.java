public class _392_isSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) return true;
        int j = 0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(j)==t.charAt(i)){
                j++;
                if(j==s.length()-1) return true;
            }
        }
        return false;
    }
}
