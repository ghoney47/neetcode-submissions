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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> out = new ArrayList<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        TreeNode curr = root;

        if (curr != null)
            q.add(curr);

        while (!q.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();


            // next snapshot
            int size = q.size();
            // per level iteration, for the length of the queue
            // for loop re evals the condition per run
            for (int i = 0; i < size; i++){
                curr = q.remove();

                if (curr != null){
                    level.add(curr.val);

                    if (curr.left != null){
                        q.add(curr.left);
                    }

                    if (curr.right != null){
                        q.add(curr.right);
                    }
                    
                }
            }

            if (level.size() > 0){
                out.add(level);
            }
        }
        
        return out;
    }

}
