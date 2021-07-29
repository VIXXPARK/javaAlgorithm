class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int answer = -1000000;
        for (int i = 0; i < nums.length - 1; i++) {
            int value = nums[i];
            answer = Math.max(answer, value);
            if (value < 0) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + value < 0)
                    break;
                else {
                    value += nums[j];
                    answer = Math.max(answer, value);
                }
            }
        }
        answer = Math.max(answer, nums[nums.length - 1]);
        return answer;
    }
}