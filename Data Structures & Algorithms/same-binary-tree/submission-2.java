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

class Solution{
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if((p == null || q == null) || (p.val != q.val)) return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}

/*class Solution {
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        listmaker(p,l1);
        listmaker(q,l2);
        return l1.equals(l2);
    }

    public void listmaker(TreeNode t, List<Integer> l){
        if(t == null){
            l.add(null);
            return;
        }
        l.add(t.val);
        listmaker(t.left, l);
        listmaker(t.right, l);
    }
}
*/