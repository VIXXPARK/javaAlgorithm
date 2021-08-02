class Solution {
    public int minPathSum(int[][] grid) {
        int col = grid.length;
        int row = grid[0].length;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (j == 0 && i + 1 < col) {
                    grid[i + 1][j] += grid[i][j];
                }
                if (i == 0 && j + 1 < row) {
                    grid[i][j + 1] += grid[i][j];
                } else {
                    if (j >= 1 && i >= 1)
                        grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }
        return grid[col - 1][row - 1];
    }
}