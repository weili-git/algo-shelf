import java.util.Stack;

public class _20_isValid {
    public static boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if((!ss.isEmpty()) && ss.peek()=='(')
                    ss.pop();
                else
                    return false;
            }
            else if(s.charAt(i)==']'){
                if((!ss.isEmpty()) && ss.peek()=='[')
                    ss.pop();
                else
                    return false;
            }
            else if(s.charAt(i)=='}'){
                if((!ss.isEmpty()) && ss.peek()=='{')
                    ss.pop();
                else
                    return false;
            }
            else {
                ss.push(s.charAt(i));
            }
        }
        // necessary
        return ss.isEmpty();

//        Stack<Character>stack = new Stack<Character>();
//        for(char c: s.toCharArray()){
//            if(c=='(')stack.push(')');
//            else if(c=='[')stack.push(']');
//            else if(c=='{')stack.push('}');
//            else if(stack.isEmpty()||c!=stack.pop())return false;
//        }
//        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "][][]{[()]}";
        System.out.println(isValid(str));
    }
}
