public class _414_thirdMax {
    public int thirdMax(int[] nums) {
        long m1 = Long.MIN_VALUE;   // [1,2,MIN_VALUE] ...
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;
        for(int num: nums){
            if(m1<num){
                m3 = m2;
                m2 = m1;
                m1 = num;
            }else if(m2<num && num<m1){
                m3 = m2;
                m2 = num;
            }else if(m3<num && num<m2){
                m3 = num;
            }
        }
        return m3==Long.MIN_VALUE?(int)m1:(int)m3;
    }
}
