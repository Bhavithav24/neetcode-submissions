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
    public int goodNodes(TreeNode root) {
        return resfun(root,root.val,0);
    }
    public int resfun(TreeNode root, int h, int res){
        if(root == null) return res;
        if(root.val >= h) {
            h = root.val;
            res++;
        }
        res = Math.max(res, resfun(root.left,h,res));
        res = Math.max(res, resfun(root.right,h,res));
        return res;
    }
}
