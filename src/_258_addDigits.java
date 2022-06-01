public class _258_addDigits {
    public int addDigits(int num) {
        if(num<10) return num;
        int tmp = num%10;
        while(num>=10){
            num/=10;
            tmp+=num%10;
        }
        return addDigits(tmp);
        // X = 100*a + 10*b + c = 99*a + 9*b + (a+b+c)；所以对9取余即可。
//        if (num==0) return 0;
//        return num % 9 == 0 ? 9 : num % 9;
    }
}
