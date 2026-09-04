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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left != null && right != null) return root; 

        if(left != null) return left;

        return right;
    }

    /*finder(root, p, l1);
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    int n = -1;
    int m = -1;
    int k = -1;
        finder(root, q, l2);
        n = l1.size() - 1;
        m = l2.size() - 1;
        k = 0;
        //rooter(l1, l2, n, m, k);
        while(n >=0 && m >=0){
            if(l1.get(n) == l1.get(m)){
                k = l1.get(n);
                n--;
                m--;
            }else{
                break;
            }
        }

        return rootfinder(root, k);
    }
    public TreeNode rootfinder(TreeNode r, int t){
        if(r == null) return null;
        if(r.val == t) return r;
        else{
            TreeNode temp = rootfinder(r.left, t);
            if(temp != null) return temp;
            temp = rootfinder(r.right,t);
            if(temp != null) return temp;
            return null;
        }
    }
    public boolean finder(TreeNode r,TreeNode x, List<Integer> l){
        if(r == null) return false;
        if(r != x){
            if(finder(r.left, x, l)){
                l.add(r.val);
                return true;
            }
            if(finder(r.right, x, l)){
                l.add(r.val);
                return true;
            }
            return false;
        }
        else{
            l.add(r.val);
            return true;
        }*/
}
