class Solution {
    public boolean isMatch(String s, String p) {
        return helper(0, 0, s, p);
    }

    public boolean helper(int left, int right, String s, String p) {
        if (p.length() == right) {
            return left == s.length();
        }
        if (s.length() < left) {
            return false;
        }
        if (right < p.length() - 1 && p.charAt(right + 1) == '*') {
            return (isRange(left, right, s, p) && helper(left + 1, right, s, p)) || helper(left, right + 2, s, p);
        }
        if (isRange(left, right, s, p)) {
            return helper(left + 1, right + 1, s, p);
        }
        return false;
    }

    public boolean isRange(int left, int right, String s, String p) {
        if (left == s.length() || right == p.length()) {
            return false;
        }
        return p.charAt(right) == '.' || p.charAt(right) == s.charAt(left);
    }
}