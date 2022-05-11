import javax.swing.plaf.synth.SynthLookAndFeel;

public class _29_divide {
    public static int divide(int dividend, int divisor) {
        if(dividend==0) return 0;
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean negative;
        negative = (dividend ^ divisor) < 0;    // 判断符号是否相同
        long t = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int res = 0;
        for(int i=31;i>=0;i--){
            if((t>>i)>=d){
                res+=1<<i;
                t-=d<<i;
            }
        }
        return negative?-res:res;
    }

    public static void main(String[] args) {
        System.out.println(divide(180, 7));
    }

}
