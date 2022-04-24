import java.util.ArrayList;
import java.util.List;

public class _119_getRow {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++) res.add(1);
        // res.set(0, 1);
        for(int i=1;i<rowIndex+1;i++){
            for(int j=i-1;j>0;j--){     // 反向求和
                res.set(j, res.get(j-1)+res.get(j));
            }
            // res.set(i, 1);
            // System.out.println(res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getRow(4));
    }
}
