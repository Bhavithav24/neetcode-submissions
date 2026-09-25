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
    int k;
    int res;
    public int kthSmallest(TreeNode root, int j) {
        k = j;
        finder(root);
        return res;
    }
    public void finder(TreeNode root){
        if(root == null) return;
        
        finder(root.left);
        k--;
        if(k==0){
            res = root.val;
            return;
        }
        finder(root.right);
        
    }
}