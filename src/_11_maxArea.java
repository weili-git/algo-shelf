public class _11_maxArea {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while (left<right){
            maxArea = Math.max(maxArea, (right-left)*Math.min(height[left], height[right]));
            if(height[left]<height[right]) left++;
            else right--;

        }
        return maxArea;
    }
    // O(n) greedy algorithm
}
// 头尾指针法，每次移动较短的边，记录最大面积