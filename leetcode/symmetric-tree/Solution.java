public class Solution {
    boolean answer = true;

    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        helper(left, right);
        return answer;
    }

    private void helper(TreeNode left, TreeNode right) {
        if (answer) {
            if (left == null && right == null)
                return;
            else if (left == null || right == null) {
                answer = false;
                return;
            }
            if (left.val != right.val) {
                answer = false;
                return;
            }
            helper(left.left, right.right);
            helper(left.right, right.left);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}