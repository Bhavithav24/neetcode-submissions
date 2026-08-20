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
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        listmaker1(p);
        listmaker2(q);
        return l1.equals(l2);
    }

    public void listmaker1(TreeNode t){
        if(t == null){
            l1.add(null);
            return;
        }
        l1.add(t.val);
        listmaker1(t.left);
        listmaker1(t.right);
    }
    public void listmaker2(TreeNode t){
        if(t == null){
            l2.add(null);
            return;
        }
        l2.add(t.val);
        listmaker2(t.left);
        listmaker2(t.right);
    }
}
