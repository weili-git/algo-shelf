import java.util.ArrayList;
import java.util.List;

public class _89_grayCode {
    public List<Integer> grayCode(int n) {//n位格雷码
        // 0 0 0
        // 0 0 1
        // 0 1 1
        // 0 1 0
        // 1 1 0
        // 1 1 1
        // 1 0 1
        // 1 0 0
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<1<<n;i++){
            int num = 0;
            for(int j=0;j<Math.log(i+0.999)/Math.log(2);j++){
                int tmp = (int)Math.pow(2, j);
                int r = i % (tmp*4);
                if(r>=tmp && r<tmp*3){
                    num += tmp;
                }
            }
            res.add(num);
        }
        return res;

        // faster
//        List<Integer> ret = new ArrayList<>();
//        for(int i = 0; i < 1<<n; ++i)
//            ret.add(i ^ i>>1);
//        return ret;
    }
}
