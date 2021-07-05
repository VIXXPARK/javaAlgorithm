package leetcode.container_with_most_water;
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        while (left <= right) {
            int hi = 0;
            int check = 0;
            if (height[left] < height[right]) {
                hi = height[left];
                check = 0;
            } else {
                hi = height[right];
                check = 1;
            }
            ans = Math.max(ans, hi * (right - left));
            if (check == 1) {
                right -= 1;
            } else {
                left += 1;
            }
        }
        return ans;
    }
}