
// Definition for a binary tree node.
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

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    private void helper(TreeNode cur, List<Integer> ans) {
        if (cur == null)
            return;
        if (cur.left != null) {
            helper(cur.left, ans);
        }
        ans.add(cur.val);
        if (cur.right != null) {
            helper(cur.right, ans);
        }
    }
}