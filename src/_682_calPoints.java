import java.util.Stack;

public class _682_calPoints {
    public int calPoints(String[] ops) {
        Stack<Integer> ss = new Stack<>();
        int a, b;
        for(String str:ops){
            if(str.equals("C")){
                ss.pop();
            } else if (str.equals("D")) {
                a = ss.peek();
                ss.push(a*2);
            } else if (str.equals("+")) {
                a = ss.pop();
                b = ss.peek();
                ss.push(a);
                ss.push(a+b);
            }else{
                ss.push(Integer.parseInt(str));
            }
        }
        if(ss.isEmpty()) return 0;
        a = ss.pop();
        while(!ss.isEmpty()){
            a += ss.pop();
        }
        return a;
    }
}
