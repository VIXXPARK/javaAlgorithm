class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        int total = m + n - 2;
        m--;
        n--;
        long up = 1;
        long down = 1;
        int large = Math.max(m, n);
        int small = Math.min(m, n);
        for (int i = total; i > large; i--)
            up *= i;
        for (int i = 1; i <= small; i++)
            down *= i;
        return (int) (up / down);
    }
}