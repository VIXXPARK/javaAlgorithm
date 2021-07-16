class Solution {
    private int left = 0;
    private int right = 0;

    public int[] searchRange(int[] nums, int target) {
        int findValue = Arrays.binarySearch(nums, target);
        if (findValue <= -1) {
            int[] ans = new int[2];
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        } else {
            left = findValue;
            right = findValue;
            while (left > 0) {
                if (nums[left - 1] == target) {
                    left--;
                } else {
                    break;
                }
            }
            while (right < nums.length - 1) {
                if (nums[right + 1] == target) {
                    right++;
                } else {
                    break;
                }
            }
            int[] ans = new int[2];
            ans[0] = left;
            ans[1] = right;
            return ans;
        }
    }
}