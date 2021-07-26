public class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                swap(i, j, j, i, matrix);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                swap(i, j, i, matrix.length - 1 - j, matrix);
            }
        }
    }

    private void swap(int i, int j, int x, int y, int[][] matrix) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = temp;
    }
}