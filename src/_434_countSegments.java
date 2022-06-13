public class _434_countSegments {
    public int countSegments(String s) {
        int num = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            while(i<n && s.charAt(i)==' ') i++;
            if(i<n && s.charAt(i) != ' ') num++;
            while(i<n && s.charAt(i)!=' ') i++;
        }
        return num;
    }
}
