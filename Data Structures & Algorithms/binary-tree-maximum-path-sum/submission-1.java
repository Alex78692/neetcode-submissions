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
        int ms =  Integer.MIN_VALUE;
        int dfs(TreeNode root){
               if(root==null){
                   return 0;
               }
               int  l   =  Math.max( 0 ,  dfs(root.left));
               int r =  Math.max(0, dfs(root.right));
               int sum =  l+root.val+r;
               ms =  Math.max(ms, sum);
               return root.val + Math.max(l, r);
        }
    public int maxPathSum(TreeNode root) {
               dfs(root);
               return ms;     
    }
}
