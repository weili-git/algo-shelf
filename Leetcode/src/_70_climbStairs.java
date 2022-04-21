public class _70_climbStairs {
    public static int climbStairs(int n) {
        // 第n个台阶只能从第n-1或者n-2个上来。到第n-1个台阶的走法 + 第n-2个台阶的走法 = 到第n个台阶的走法，已经知道了第1个和第2个台阶的走法，一路加上去。
        if(n == 1){return 1;}
        if(n == 2){return 2;}
        int a = 1, b = 2, temp;
        for(int i = 3; i <= n; i++){
            temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
