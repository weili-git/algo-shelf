import static java.lang.Math.max;

public class _58_lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int current = 0;
        boolean end = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && end) {
                current = 1;
                end = false;    // start a new word
            }
            else if(s.charAt(i)!=' ' && (!end)){
                current++;      // length increase
            }else if(s.charAt(i) == ' ') {
                end = true;     // end a word
            }
        }
        return current;  // last word
    }
    public static int lengthOfLastWord1(String s) {  // inverse traverse
        int current = 0;
        boolean start = false;
        for(int i=s.length()-1; i>=0;i--){
            if(s.charAt(i)==' ' && start) {
                return current;
            }else if(s.charAt(i)==' ' && !start){
                continue;
            }
            else if(s.charAt(i)!=' ' && !start){
                start = true;
                current = 1;
            }else if(s.charAt(i)!=' ' && start){
                current++;
            }
        }
        return current;  // last word
    }
    public static void main(String[] args) {
        String str = " luffy is still joyboy  ";
        System.out.println(lengthOfLastWord1(str));
    }
}
