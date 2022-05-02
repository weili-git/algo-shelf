public class _190_reverseBits {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int a=0;
        for(int i=0;i<=31;i++){
            a=a+((1&(n>>i))<<(31-i));
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(-3));
    }
}
