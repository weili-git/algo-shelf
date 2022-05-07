import java.util.ArrayList;
import java.util.List;

public class _202_isHappy {
    public static boolean isHappy(int n) {
        int sum = n;
        List<Integer> list = new ArrayList<>();
        list.add(sum);
        while(sum!=1){
            int tmp = 0;
            while(sum!=0){
                tmp += (sum%10) * (sum%10);
                sum /= 10;
            }
            sum = tmp;
            // System.out.println(sum);
            if(list.contains(sum)){
                return false;
            }else{
                list.add(sum);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        // 快慢指针
    }
}
