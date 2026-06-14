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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null && subRoot == null)
            return true;
        
        if (root == null || subRoot == null)
            return false;


        if (root.val == subRoot.val){
            if (isSameTree(root, subRoot))
                return true;
        } 

        return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);

    }

    public boolean isSameTree(TreeNode root, TreeNode sub){
        if (root == null && sub == null)
            return true;
        
        if (sub == null || root == null)
            return false;

        if (root.val == sub.val)
            return isSameTree(root.right, sub.right) && isSameTree(root.left, sub.left) && true;
        
        return false;
    }

}
