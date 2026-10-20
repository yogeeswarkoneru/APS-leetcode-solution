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
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean xFound = false;
            boolean yFound = false;
            TreeNode xParent = null;
            TreeNode yParent = null;

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (curr.left != null) {
                    if (curr.left.val == x) {
                        xFound = true;
                        xParent = curr;
                    }
                    if (curr.left.val == y) {
                        yFound = true;
                        yParent = curr;
                    }
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    if (curr.right.val == x) {
                        xFound = true;
                        xParent = curr;
                    }
                    if (curr.right.val == y) {
                        yFound = true;
                        yParent = curr;
                    }
                    queue.offer(curr.right);
                }
            }

            if (xFound && yFound) {
                return xParent != yParent;
            }

            
            if (xFound || yFound) {
                return false;
            }
        }

        return false;
    }
}