import java.util.ArrayList;
import java.util.List;

public class _241_diffWaysToCompute {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char ch = expression.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'){
                List<Integer> res1 = diffWaysToCompute(expression.substring(0,i));
                List<Integer> res2 = diffWaysToCompute(expression.substring(i+1));
                for(int m:res1){
                    for(int n:res2){
                        switch(ch){
                            case '+':
                                res.add(m+n);
                                break;
                            case '-':
                                res.add(m-n);
                                break;
                            case '*':
                                res.add(m*n);
                                break;
                        }

                    }
                }
            }
        }
        if(res.size()==0) res.add(Integer.valueOf(expression));
        return res;
    }
}
