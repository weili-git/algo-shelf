import java.util.HashMap;
import java.util.Map;

public class _697_findShortestSubArray {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();  // times, left, right
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            }else{
                map.put(nums[i], new int[]{1, i, i});
            }
        }
        int max = 0, minLen = 0;
        int[] arr;
        for(Map.Entry<Integer,int[]> item : map.entrySet()){
            arr = item.getValue();
            if(max<arr[0]){
                max = arr[0];
                minLen = arr[2]-arr[1]+1;
            }else if(max==arr[0]) {
                minLen = Math.min(minLen, arr[2] - arr[1] + 1);
            }
        }
        return minLen;
    }
}
