// Last updated: 7/9/2026, 3:10:04 PM
class Solution {

    public boolean helper(TreeNode a, TreeNode b) {

        if (a == null && b == null) {
            return true;
        }

        if (a != null && b == null) {
            return false;
        }

        if (a == null && b != null) {
            return false;
        }

        if (a.val != b.val) {
            return false;
        }

        if (helper(a.left, b.right) == false) {
            return false;
        }

        if (helper(a.right, b.left) == false) {
            return false;
        }

        return true;
    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return helper(root.left, root.right);
    }
}