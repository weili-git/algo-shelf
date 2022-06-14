public class _453_minMoves {
    public int minMoves(int[] nums) {
        // 相当于最大元素-1
        int moves = 0;
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            if(num<min) min = num;
        }
        for(int num:nums){
            moves += num-min;
        }
        return moves;
    }
}
