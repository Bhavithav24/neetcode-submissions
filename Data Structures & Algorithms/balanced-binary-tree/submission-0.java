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
    int res = 0;
    public boolean isBalanced(TreeNode root) {
        heightdiff(root);
        if(res > 1) return false;
        else return true;
    }
    public int heightdiff(TreeNode root){
        if(root == null) return 0;
        int l = heightdiff(root.left);
        int r = heightdiff(root.right);
        res = Math.max(Math.abs(l - r), res);
        return Math.max(l,r) + 1;
    }
}
