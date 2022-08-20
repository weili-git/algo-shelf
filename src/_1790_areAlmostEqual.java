public class _1790_areAlmostEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        char ch1 = '\0', ch2 = '\0';
        int diff = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)) continue;
            if(diff==0){
                diff++;
                ch1 = s1.charAt(i);
                ch2 = s2.charAt(i);
            }else if(diff==1){
                if(ch1==s2.charAt(i) && ch2==s1.charAt(i)){
                    diff++;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return diff==0||diff==2;
    }
}
