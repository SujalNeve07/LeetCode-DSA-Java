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
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;
    // without lambda function
    // ArrayList<Integer> list = new ArrayList<>();
    public void recoverTree(TreeNode root) {
    //     inorder(root);

    //     ArrayList<Integer> sorted = new ArrayList<>(list);
    //     Collections.sort(sorted);

       
    //     int a = 0, b = 0;

    //     for (int i = 0; i < list.size(); i++) {
    //         if (!list.get(i).equals(sorted.get(i))) {
    //             if (a == 0)
    //                 a = list.get(i);
    //             else {
    //                 b = list.get(i);
    //                 break;
    //             }
    //         }
    //     }
    //     swap(root, a, b);
        
    // }
    // void inorder(TreeNode root) {
    //     if (root == null)
    //         return;

    //     inorder(root.left);
    //     list.add(root.val);
    //     inorder(root.right);
    // }

    // void swap(TreeNode root, int a, int b) {
    //     if (root == null)
    //         return;

    //     if (root.val == a)
    //         root.val = b;
    //     else if (root.val == b)
    //         root.val = a;

    //     swap(root.left, a, b);
    //     swap(root.right, a, b);
    // }


        helper(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);

        if(prev != null && prev.val >= root.val){
            if(first == null){
                first = prev;
            }
            second = root;
        }
        prev = root;
        helper(root.right);
    }
}
