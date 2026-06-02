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
    public int diameterOfBinaryTree(TreeNode root) {
        //null checking
        if(root == null)
            return 0;

        int d = 0;

        ArrayDeque<TreeNode> q = new ArrayDeque<>();

        q.add(root);

        //iterating through all nodes to check depth from each
        while (!q.isEmpty()){
            TreeNode curr = q.remove();

            if(curr.left != null)
                q.add(curr.left); 
            
            if(curr.right != null)
                q.add(curr.right);
            
            int temp = dfsHelper(curr.left) + dfsHelper(curr.right);
            
            //overwrites current if it is larger
            d = (temp > d) ? temp : d;
        }

        return d;
    }



    public int dfsHelper(TreeNode root){
        if (root == null)
            return 0;


        int right = dfsHelper(root.right);
        int left = dfsHelper(root.left);

        System.out.println("Current node " +  root.val + " with values right: " + right + " and left: " + left);
        

        return (right > left) ? right + 1 : left + 1;

    }

}
