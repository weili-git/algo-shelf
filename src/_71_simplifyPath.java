import java.util.Stack;

public class _71_simplifyPath {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> ss = new Stack<>();
        for(String str: arr){
            if(str.equals("..") && !ss.isEmpty()){
                ss.pop();
            }
            if(!str.equals(".") && !str.equals("") && !str.equals("..")) {
                ss.push(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!ss.isEmpty()){
            sb.insert(0, ss.pop());
            sb.insert(0, "/");
        }
        if(sb.length()==0) sb.append("/");
        return sb.toString();
    }
}
