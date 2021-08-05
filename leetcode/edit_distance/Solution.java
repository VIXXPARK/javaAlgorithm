class Solution {
    public int minDistance(String word1, String word2) {
        int col = word1.length() + 1;
        int row = word2.length() + 1;
        int[][] dp = new int[col][row];
        for (int i = 0; i < row; i++)
            dp[0][i] = i;
        for (int j = 0; j < col; j++)
            dp[j][0] = j;
        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }
        return dp[col - 1][row - 1];
    }
}