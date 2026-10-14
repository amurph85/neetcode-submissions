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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(subRoot == null){
            return true;
        }
        if(isSameTree(root, subRoot)){
            return true;
        }
        return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);



    }
    private boolean isSameTree(TreeNode q, TreeNode p){
        if(p == null && q == null){
            return true;
        }
        if(p != null && q != null && p.val == q.val){
            return isSameTree(q.right, p.right) && isSameTree(q.left, p.left);
        }
        else{
            return false;
        }
    }

}
