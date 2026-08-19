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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(root,targetSum,ans,new ArrayList<>());
        return ans;
        
    }

    public void backtrack(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> curr)
    {
        if(root==null)
        {
            return; 
        }

        curr.add(root.val);

        // check the final leaf node (here we are checking only the leaf node)
        if(root.left==null && root.right==null && targetSum - root.val == 0)
        {
            ans.add(new ArrayList<>(curr));
        }

        // recursively call the function (here we are calculationg the intermediate node values for targetsum - root.val)
        backtrack(root.left,targetSum-root.val,ans,curr);
        backtrack(root.right,targetSum-root.val,ans,curr);

        curr.remove(curr.size()-1);
    }
}