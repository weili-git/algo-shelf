import java.util.HashMap;

public class _2190_mostFrequent {
    public static int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i=0;i<len-1;++i){
            if(nums[i]==key) {
                map.put(nums[i+1], map.getOrDefault(nums[i+1], 0)+1);
            }
        }
        int occur = 0;
        int res = 0;
        for(int k:map.keySet()){
            // System.out.printf("%d, %d\n", k, map.get(k));
            if(map.get(k)>occur) {
                res = k;
                occur = map.get(k);
            }
            // System.out.println(res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 3};
        System.out.println("return: "+mostFrequent(nums, 2));
    }
}
