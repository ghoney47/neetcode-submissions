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
    public TreeNode invertTree(TreeNode root) {
        ArrayDeque<TreeNode> q = new ArrayDeque<>();

        if(root == null)
            return root;
        
        q.add(root);

        TreeNode curr = root;

        while (!q.isEmpty()){
            curr = q.remove();


            System.out.println("Current node: " + curr.val);

            //swapping L and R pointers of current
            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            if(curr.left != null)
                System.out.println("New left: " + curr.left.val);

            if(curr.right != null)
                System.out.println("New right: " + curr.right.val);

            //adding children to the queue, null checking 
            if(curr.left != null){
                q.add(curr.left);
                System.out.println("Added left: " + curr.left.val);
            }

            if (curr.right != null){
                q.add(curr.right);
                System.out.println("Added right: " + curr.right.val);
            }

        }

        return root;



    }
}
