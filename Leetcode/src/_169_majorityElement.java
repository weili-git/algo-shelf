import java.util.Stack;

public class _169_majorityElement {
    public static int majorityElement(int[] nums) {
        Stack<Integer> ss = new Stack<>();
        for (int num : nums) { // 情理
            if (ss.isEmpty()) {
                ss.push(num);
            } else {
                if (ss.peek() == num)
                    ss.push(num);
                else
                    ss.pop();
            }
        }
        return ss.peek();
    }

    public static void main(String[] args) {
        // You may assume that the majority element always exists in the array.
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
