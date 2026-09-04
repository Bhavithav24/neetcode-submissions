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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        return order(root, 0);
    }
    public List<List<Integer>> order(TreeNode root, int k){
        if(root == null) return list;
        if(list.size() == k) list.add(new ArrayList<>());
        list.get(k).add(root.val);
        k++;
        list = order(root.left,k);
        list = order(root.right,k);
        return list;
    }
}
