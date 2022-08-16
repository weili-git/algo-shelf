import java.util.HashMap;

public class _1394_findLucky {
    public int findLucky(int[] arr) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int num:arr){
//            map.put(num, map.getOrDefault(num,0)+1);
//        }
//        int max = -1;
//        for(int num:map.keySet()){
//            if(map.get(num)==num){
//                max = Math.max(max, num);
//            }
//        }
//        return max;

        int n = arr.length;
        int[] res = new int[n + 1];
        for (int i : arr) {
            if (i <= n) {
                res[i]++;
            }
        }
        for (int i = n; i >= 1; i--) {
            if (i == res[i]) {
                return i;
            }
        }
        return -1;
    }
}
