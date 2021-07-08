class Solution {
    private List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        helper(0, 0, "", n);
        return ans;
    }

    public void helper(int left, int right, String res, int n) {
        if (left == n && right == n) {
            ans.add(new String(res));
            return;
        } else {
            if (left < n) {
                helper(left + 1, right, res + "(", n);
            }
            if (left > right && right < n && left <= n) {
                helper(left, right + 1, res + ")", n);
            }
        }
    }
}