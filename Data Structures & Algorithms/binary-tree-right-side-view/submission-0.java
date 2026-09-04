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
    public List<Integer> rightSideView(TreeNode root) {
        order(root,0,list);
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            List<Integer> s = list.get(i);
            res.add(s.get(s.size() - 1));
        }
        return res;
    }
    public void order(TreeNode root, int k, List<List<Integer>> ls){
        if(root == null) return;
        if(ls.size() == k) ls.add(new ArrayList<>());
        ls.get(k++).add(root.val);
        order(root.left, k, ls);
        order(root.right, k, ls);
    }
}
