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
    public boolean isSubtree(TreeNode r, TreeNode sr) {
        if(r == null) return false;
        if(isSameTree(r, sr)) return true;
        return (isSubtree(r.left, sr) || isSubtree(r.right, sr));
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if((p == null || q == null) || (p.val != q.val)) return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}
