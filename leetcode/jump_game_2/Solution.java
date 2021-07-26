class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < i + nums[i] + 1; j++) {
                if (j < nums.length) {
                    if (dp[j] == 0) {
                        dp[j] = dp[i] + 1;
                    } else {
                        dp[j] = Math.min(dp[j], dp[i] + 1);
                    }
                }
            }
        }
        return dp[nums.length - 1] - 1;
    }
}