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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
        {
            return null;
        }
        if(root.val>key)
        {
            root.left = deleteNode(root.left,key);
        }
        else if(root.val<key)
        {
            root.right = deleteNode(root.right,key);
        }
        else
        {
            // Delete a node with no children
            if(root.left==null && root.right==null)
            {
                return  null;
            }
            // Delete a node with single child 
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            // Delete a node with both children
            int successor = findSuccessor(root.right);
            root.val = successor;
            root.right = deleteNode(root.right,successor);
        }
        return root;
        
    }

    public int findSuccessor(TreeNode node)
    {
        while(node.left!=null)
        {
            node=node.left;
        }
        return node.val;
    }
}