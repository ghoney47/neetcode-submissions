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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> inOrder = new ArrayList<>();

        dfs(root, inOrder);
        return inOrder.get(k - 1);
    }

    public void dfs(TreeNode root, ArrayList<Integer> order){
        if (root == null) return;

        dfs(root.left, order);
        order.add(root.val);
        dfs(root.right, order);

    }

}
