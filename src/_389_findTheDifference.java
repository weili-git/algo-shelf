public class _389_findTheDifference {
    public char findTheDifference(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int sum = 0;
        for(char ch:a){
            sum -= ch;
        }
        for(char ch:b){
            sum += ch;
        }
        return (char)sum;
    }
}
