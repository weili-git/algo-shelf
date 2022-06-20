public class _509_fib {
    public int fib(int n) {
        if(n==0||n==1) return n;
        int a = 0;
        int b = 1;
        int tmp;
        for(int i=0;i<n-1;i++){
            tmp = b;
            b = a + b;
            a = tmp;
        }
        return b;
    }
}
