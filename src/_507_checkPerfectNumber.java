public class _507_checkPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int upper = num;
        int lower = 1;
        int sum = 0;
        for(;lower<upper;lower++){
            if(num%lower==0){
                sum += lower + num/lower;
                upper = num/lower;
            }
        }
        return num == sum - num;
    }
}
