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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        //root checking
        // null checking
        if (p == null && q == null)
            return true;

        // only one is null
        if (p == null || q == null)
            return false;

        //checking root values are the same
        if (p.val != q.val)
            return false;



        //children checking

        //checking both children are null
        if (p.right == null && q.right == null && q.left == null && p.left == null)
            return true;
        
        //checking one of the children are null
        if (p.right == null && q.right != null || p.left == null && q.left != null || p.right != null && q.right == null ||
            p.left != null && q.left == null)
            return false;

        //System.out.println("Current node is " + p.val + " and " + q.val);

        //checking null + value mix
        if (p.right == null || q.right == null ||  p.left == null || q.left == null){

            //System.out.println("Null + value mix for root " + p.val + " and " + q.val);

            if (p.right == null)    
                if (q.right == null && p.left.val == q.left.val)
                    return true && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);

            if (p.left == null)
                if (q.left == null && p.right.val == q.right.val)
                    return true && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);

            return false;
        }
            
        
        //checking children values are the same
        if ((p.right.val == q.right.val && p.left.val == q.left.val))
            return true && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);

        return false;

        
    }

    
}
