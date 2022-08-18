public class _1460_canBeEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        // 冒泡排序
        if(target.length!=arr.length) return false;
        int[] cnt = new int[1001];
        for(int num:target){
            cnt[num]++;
        }
        for(int num:arr){
            cnt[num]--;
            if(cnt[num]<0) return false;
        }
        return true;
    }
}
