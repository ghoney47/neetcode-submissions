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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // BST property allows us to know that to the right is greater, left is less 

        TreeNode curr = root;

        // either both have to be less than or greater than
        while ((p.val > curr.val && q.val > curr.val) || (p.val < curr.val && q.val < curr.val)){

            if (p.val > curr.val && q.val > curr.val) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        return curr;
    }
}
