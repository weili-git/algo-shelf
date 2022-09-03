import java.util.Arrays;

public class LCP02_halfQuestions {
    public int halfQuestions(int[] questions) {
        int[] type = new int[1001];
        for(int q: questions){
            type[q]++;
        }
        // type 序号没有任何关系
        Arrays.sort(type);
        int human = questions.length/2;
        int res = 0;
        for(int i=1000;i>=0 && human>0;i--){
            if(human > type[i]){
                human -= type[i];
                res++;
            }else{
                res++;
                break;
            }
        }
        return res;
    }
}
