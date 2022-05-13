public class _167_twoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        int[] res = new int[2];
        while(left<right){
            int tmp = target - numbers[left];
            while(right>=0 && numbers[right]>tmp) right--;
            if(numbers[right]==tmp){
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
            left++;
        }
        return res; // exactly one solution
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7 ,9};
        int[] res = twoSum(nums, 8);
        System.out.printf("%d, %d\n", res[0], res[1]);
    }
}
