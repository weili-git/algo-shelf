public class _1217_minCostToMoveChips {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for(int num:position){
            if(num%2==1) odd++;
            else even++;
        }
        return Math.min(odd, even);
        // 因为移动2个位置不需要代价，那么奇数位置移到奇数位置不用代价，偶数位置移到偶数位置不用代价，那就分别统计奇数位置和偶数位置的个数，相当于把所有奇数放一起，所有偶数的放一起，然后比较奇数的少还是偶数的少，将少的个数移到多的个数位置上去就可以了
    }
}
