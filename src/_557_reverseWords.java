public class _557_reverseWords {
    public String reverseWords(String s) {
        if(s==null||s.length()<=1) return s;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int j = 0;
//        while(j<n && s.charAt(j)==' ') {
//            j++;    // first char != ' '
//            sb.append(' ');
//        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' ') {
                int k = i-1;
                while(k>=j){
                    sb.append(s.charAt(k));
                    k--;
                }
                sb.append(' ');
                j = i+1;
            }
        }
        int k = n-1;
        while(k>=j){
            sb.append(s.charAt(k));
            k--;
        }
        return sb.toString();
    }
}
