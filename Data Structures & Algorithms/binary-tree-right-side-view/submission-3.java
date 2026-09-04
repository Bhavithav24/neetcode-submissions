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
    List<Integer> list = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        order(root,0,list);
        
        return list;
    }
    public void order(TreeNode root, int k, List<Integer> ls){
        if(root == null) return;
        if(list.size() == k) list.add(root.val);
        k++;
        order(root.right, k, ls);
        order(root.left, k, ls);
    }
}
