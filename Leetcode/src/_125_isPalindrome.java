import java.util.Stack;

public class _125_isPalindrome {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while (i<j){
            while(i<n && !isAz(s.charAt(i))) i++;  // be care of index, './'
            while(j>=0 && !isAz(s.charAt(j))) j--;
            if(i<=j){
                if(toLower(s.charAt(i))==toLower(s.charAt(j))){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isAz(char ch){
        return (ch>='a' && ch<='z') || (ch>='A' && ch<= 'Z' || (ch>='0' && ch<='9'));
    }
    public static char toLower(char ch){
        return (ch>='A' && ch<= 'Z')?(char)((int)ch+32):ch;
    }

    public static void main(String[] args) {
        // String str = "A man, a plan, a canal: Panama"; // "aabb", stack is not suitable
        String str = "0P";
        System.out.println(isPalindrome(str));
    }
}
