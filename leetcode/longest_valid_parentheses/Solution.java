class Solution {
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length() + 1];
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            int loc = -1;
            if (i != 0) {
                loc = i - dp[i - 1] * 2 - 1;
            }
            if (s.charAt(i) == ')') {
                if (i >= 1 && s.charAt(i - 1) == '(') {
                    dp[i] = (i - 2 >= 0) ? dp[i - 2] + 1 : 1;
                } else if (i > 1 && s.charAt(i - 1) == ')' && loc >= 0 && s.charAt(loc) == '(') {
                    dp[i] = (loc >= 1) ? dp[loc - 1] + 1 + dp[i - 1] : 1 + dp[i - 1];
                }
            }
            answer = Math.max(answer, dp[i] * 2);
        }
        return answer;
    }
}