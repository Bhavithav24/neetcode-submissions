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
    int c = 0;
    public int goodNodes(TreeNode root) {
        return count(root,-101);
    }
    public int count(TreeNode root, int max){
        if(root == null) return 0;

        if(max <= root.val){
            max = root.val;
            c++;
        }

        count(root.left,max);
        count(root.right,max);
        return c;
    }
}
