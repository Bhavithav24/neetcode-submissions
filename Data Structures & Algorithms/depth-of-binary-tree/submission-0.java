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
    static int depth(TreeNode root, int l){
        if(root == null){
            return l;
        }
        l++;
        l = Math.max(depth(root.left, l), depth(root.right, l));
        return l;
    }
    public int maxDepth(TreeNode root) {
        int l = 0;
        return depth(root,l);
        
    }
}
