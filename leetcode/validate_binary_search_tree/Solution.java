public class TreeNode {
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


public class Solution {
    boolean answer = true;

    public boolean isValidBST(TreeNode root) {
        Stack<Integer> stack = new Stack<>();
        inOrderTraversal(root, stack);
        return answer;
    }

    private void inOrderTraversal(TreeNode cur, Stack<Integer> stack) {
        if (cur == null)
            return;
        if (cur.left != null)
            inOrderTraversal(cur.left, stack);
        if (!stack.empty()) {
            if (stack.peek() >= cur.val) {
                answer = false;
                return;
            }
        }
        stack.push(cur.val);
        if (cur.right != null)
            inOrderTraversal(cur.right, stack);
    }
}