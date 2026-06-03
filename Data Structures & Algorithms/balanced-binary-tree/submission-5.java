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
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        //tracks if fails at any level
        boolean[] mem = {true};
    
        int left = dfsHelper(root.left, mem);
        int right = dfsHelper(root.right, mem);

        //checks imbalance at the root
        if (left - right > 1 || left - right < -1)
            return false;
        

        return mem[0];
    }


    public int dfsHelper(TreeNode root, boolean[] mem){
        if (root == null)
            return 0;
        
        int left = dfsHelper(root.left, mem);
        int right = dfsHelper(root.right, mem);

        //System.out.println("At node " + root.val + " Left height: " + left + ", Right height: " + right);

        //overwrites if left is less, or if right is greater
        if (left - right > 1 || left - right < -1)
            mem[0] = false;


        return Math.max(left, right) + 1;
    }
}
