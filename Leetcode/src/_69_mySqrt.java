public class _69_mySqrt {
    public static int mySqrt(int x) {
        if(x == 1)
            return 1;
        int min = 0;
        int max = x;
        while(max-min>1)
        {
            int m = (max+min)/2;
            if(x/m<m)       // avoid overflow
                max = m;
            else
                min = m;
        }
        return min;
    }
    public static void main(String[] args) {
        int a = 1<<31-1;
        //int a = 2147395600;
        System.out.println(a);
        System.out.println(mySqrt(a));
    }
}
