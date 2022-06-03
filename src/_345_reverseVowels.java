public class _345_reverseVowels {
    public String reverseVowels(String s) {
        int n = s.length();
        int i=0,j=n-1;
        StringBuilder sb = new StringBuilder(s);
        while(i<j){
            while(i<n && !isVowel(s.charAt(i))) i++;
            while(j>=0 && !isVowel(s.charAt(j))) j--;
            if(i<j){
                char tmp = s.charAt(i);
                sb.replace(i,i+1,s.charAt(j)+"");
                sb.replace(j,j+1,tmp+"");
            }
            i++;
            j--;
        }
        return sb.toString();
    }
    private boolean isVowel(char ch){
        switch (ch){
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                return true;
            default:
                return false;
        }
    }
}
