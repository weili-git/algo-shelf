public class _191_hammingWeight {
    public static int hammingWeight(int n) {
        int a=0;
        for(int i=0;i<32;i++){
            if((1&(n>>i))!=0) a++;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(128));
    }
}
