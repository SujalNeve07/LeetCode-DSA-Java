/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean flag = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(root, targetSum, 0);
        return flag;
    }

    public void helper(TreeNode root, int targetSum, int currentSum) {
        // base condition
        if (flag)
            return;
        if (root == null)
            return;

        if ((root.left == null && root.right == null) && (targetSum == currentSum + root.val)) {
            flag = true;
            return;
        }

        helper(root.left, targetSum, currentSum + root.val);
        helper(root.right, targetSum, currentSum + root.val);
    }
}