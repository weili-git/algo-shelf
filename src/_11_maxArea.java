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
// 一开始两个指针一个指向开头一个指向结尾，此时容器的底是最大的，接下来随着指针向内移动，会造成容器的底变小，在这种情况下想要让容器盛水变多，就只有在容器的高上下功夫。